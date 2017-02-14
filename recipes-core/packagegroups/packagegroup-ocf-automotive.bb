DESCRIPTION = "OCF Automotive full package set including examples"
LICENSE = "Apache-2.0"

inherit packagegroup

PACKAGES = "packagegroup-ocf-automotive"
ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += " packagegroup-iotivity"

# Dummy resource"/DummyResURI"
#RDEPENDS_${PN} += " iotivity-example-dummy"

# Binary resource"/BinaryResURI"
#RDEPENDS_${PN} += " iotivity-example"
RDEPENDS_${PN} += " iotivity-example-gpio"
#RDEPENDS_${PN} += " iotivity-example-mraa"
#RDEPENDS_${PN} += " iotivity-example-csdk"

# Other resources
RDEPENDS_${PN} += " iotivity-example-number"
RDEPENDS_${PN} += " iotivity-example-line"
RDEPENDS_${PN} += " iotivity-example-geolocation"

# TODO
RDEPENDS_${PN} += " iotivity-example-demo"

RDEPENDS_${PN} += " iotivity-node"
RDEPENDS_${PN} += " nodejs-npm"
RDEPENDS_${PN} += " nodejs"

# Utilities
RDEPENDS_${PN} += " systemd-serialgetty util-linux-agetty"
RDEPENDS_${PN} += " os-release"
RDEPENDS_${PN} += " tmux"
RDEPENDS_${PN} += " python-smartpm"
RDEPENDS_${PN} += " nano"
RDEPENDS_${PN} += " file"
RDEPENDS_${PN} += " grep"
RDEPENDS_${PN} += " expect"
RDEPENDS_${PN} += " zile"


# Developement
RDEPENDS_${PN} += " iotivity-dev"
RDEPENDS_${PN} += " git"
RDEPENDS_${PN} += " pkgconfig"
RDEPENDS_${PN} += " gcc gcc-symlinks"
RDEPENDS_${PN} += " g++ g++-symlinks"
RDEPENDS_${PN} += " make"
RDEPENDS_${PN} += " sudo"
RDEPENDS_${PN} += " autoconf automake binutils"
RDEPENDS_${PN} += " libstdc++ libstdc++-dev"
RDEPENDS_${PN} += " coreutils"

# Hardware
RDEPENDS_${PN} += " i2c-tools"

# Raspberrypi
RDEPENDS_${PN} += " rpi-gpio"
RDEPENDS_${PN} += " wiringpi"
RDEPENDS_${PN} += " wiringpi-dev"
