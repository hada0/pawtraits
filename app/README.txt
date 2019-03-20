Installing MEOW on a MacBook:

Ensure you have gradle installed and

1) Build project by entering: ./gradlew build
2) On device, activate adb by following Settings > System > Developer Options > Tap build 7 times OR
   check the device USB debugging option is on.
2) Generate APK and install it on emulator/device: ./gradlew installdebug
3) APK file is generated and stored in Meow/app/build/outputs/apk/debug/
4) App 'Meow' should appear in the main menu