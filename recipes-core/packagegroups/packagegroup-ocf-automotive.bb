DESCRIPTION = "OCF Automotive full package set including examples"
LICENSE = "Apache-2.0"

inherit packagegroup

PACKAGES = "packagegroup-ocf-automotive"
ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += " packagegroup-iotivity"

# Dummy resource"/DummyResURI"
RDEPENDS_${PN} += " iotivity-example-dummy"

# Binary resource"/BinaryResURI"
#RDEPENDS_${PN} += " iotivity-example-switch"
RDEPENDS_${PN} += " iotivity-example-gpio"
#RDEPENDS_${PN} += " iotivity-example-mraa"
#RDEPENDS_${PN} += " iotivity-example-csdk"

# Other resources
RDEPENDS_${PN} += " iotivity-example-number"
RDEPENDS_${PN} += " iotivity-example-line"
RDEPENDS_${PN} += " iotivity-example-geolocation"

# NodeJS
RDEPENDS_${PN} += " iotivity-example-demo"
RDEPENDS_${PN} += " packagegroup-nodejs-runtime"
RDEPENDS_${PN} += " nodejs-npm"

RDEPENDS_${PN} += " node-rest-client"

RDEPENDS_${PN} += " bh1750"
RDEPENDS_${PN} += " epoll"
RDEPENDS_${PN} += " q"
RDEPENDS_${PN} += " i2c"

RDEPENDS_${PN} += " lcd"
RDEPENDS_${PN} += " onoff"
RDEPENDS_${PN} += " bindings"
RDEPENDS_${PN} += " repl"
RDEPENDS_${PN} += " underscore"
RDEPENDS_${PN} += " coffee-script"
RDEPENDS_${PN} += " nan"

# Utilities
RDEPENDS_${PN} += " git"
RDEPENDS_${PN} += " screen"
RDEPENDS_${PN} += " sudo"

RDEPENDS_${PN} += " systemd-serialgetty util-linux-agetty"
RDEPENDS_${PN} += " os-release"
RDEPENDS_${PN} += " tmux"
RDEPENDS_${PN} += " python-smartpm"
RDEPENDS_${PN} += " nano"
RDEPENDS_${PN} += " file"
RDEPENDS_${PN} += " grep"
RDEPENDS_${PN} += " expect"
RDEPENDS_${PN} += " zile"

# Development
RDEPENDS_${PN} += " iotivity-dev"
RDEPENDS_${PN} += " pkgconfig"
RDEPENDS_${PN} += " gcc gcc-symlinks"
RDEPENDS_${PN} += " g++ g++-symlinks"
RDEPENDS_${PN} += " make"
RDEPENDS_${PN} += " autoconf automake binutils"
RDEPENDS_${PN} += " libstdc++ libstdc++-dev"
RDEPENDS_${PN} += " coreutils"

# Hardware
RDEPENDS_${PN} += " i2c-tools"


