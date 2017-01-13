RDEPENDS_${PN} += " iotivity-example-geolocation "
RDEPENDS_${PN} += " git "
RDEPENDS_${PN} += " iotivity-node "
RDEPENDS_${PN} += " iotivity-dev "
RDEPENDS_${PN} += " nodejs-npm "
RDEPENDS_${PN} += " nodejs "
RDEPENDS_${PN} += " johnny-five "
RDEPENDS_${PN} += " make "
RDEPENDS_${PN} += " sudo "
RDEPENDS_${PN} += " wiringpi "
RDEPENDS_${PN} += " wiringpi-dev "
RDEPENDS_${PN} += " autoconf automake binutils \
 libstdc++ libstdc++-dev \
 file coreutils \
 i2c-tools \
 rpi-gpio \
 os-release \
"
RDEPENDS_${PN} += " gcc gcc-symlinks "
RDEPENDS_${PN} += " g++ g++-symlinks "
RDEPENDS_${PN} += " python-smartpm "
RDEPENDS_${PN} += " nano "

#RDEPENDS_${PN} += " systemd-serialgetty util-linux-agetty"

# TODO
# http://unix.stackexchange.com/questions/308811/autoload-a-kernel-module-in-yocto
# KERNEL_MODULE_AUTOLOAD += "i2c-dev"
# ENABLE_I2C = "1"

RDEPENDS_${PN} += " i2c-tools "
RDEPENDS_${PN} += " spitools "
