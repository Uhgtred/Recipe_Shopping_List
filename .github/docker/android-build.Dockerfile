# Build_and_compile_container for Kotlin Android/Compose builds
FROM eclipse-temurin:17-jdk

ENV ANDROID_SDK_ROOT=/opt/android-sdk \
    DEBIAN_FRONTEND=noninteractive \
    GRADLE_USER_HOME=/home/gradle/.gradle

RUN apt-get update && apt-get install -y --no-install-recommends \
        wget unzip curl git ca-certificates \
    && rm -rf /var/lib/apt/lists/*

# Install Android commandline tools
RUN mkdir -p /opt && cd /opt \
    && wget -q https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip -O cmdtools.zip \
    && mkdir -p ${ANDROID_SDK_ROOT}/cmdline-tools \
    && unzip -q cmdtools.zip -d ${ANDROID_SDK_ROOT}/cmdline-tools \
    && mv ${ANDROID_SDK_ROOT}/cmdline-tools/cmdline-tools ${ANDROID_SDK_ROOT}/cmdline-tools/latest \
    && rm cmdtools.zip

ENV PATH="$PATH:${ANDROID_SDK_ROOT}/cmdline-tools/latest/bin:${ANDROID_SDK_ROOT}/platform-tools"

# Accept licenses and install required SDK packages (adjust versions as needed)
RUN yes | sdkmanager --licenses
RUN sdkmanager \
    "platform-tools" \
    "platforms;android-36" \
    "build-tools;35.0.0"

# Create gradle user for caching
RUN useradd -m gradle && mkdir -p ${GRADLE_USER_HOME}
# Ensure SDK directory is writable by the gradle user
RUN chown -R gradle:gradle ${ANDROID_SDK_ROOT}
USER gradle
WORKDIR /workspace

# Default command (overridden by CI)
CMD ["bash", "-lc", "./gradlew --version"]
