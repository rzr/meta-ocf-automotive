DESCRIPTION = "OCF Automotive full package set including examples"
LICENSE = "Apache-2.0"

inherit packagegroup

PACKAGES = "packagegroup-ocf-automotive-devel"
ALLOW_EMPTY_${PN} = "1"

# Utilities
RDEPENDS_${PN} += " git"
RDEPENDS_${PN} += " screen"
RDEPENDS_${PN} += " sudo"
RDEPENDS_${PN} += " util-linux-agetty"
RDEPENDS_${PN} += " file"
RDEPENDS_${PN} += " grep"
RDEPENDS_${PN} += " expect"

# Development
RDEPENDS_${PN} += " iotivity-dev"
RDEPENDS_${PN} += " pkgconfig"
RDEPENDS_${PN} += " gcc gcc-symlinks"
RDEPENDS_${PN} += " g++ g++-symlinks"
RDEPENDS_${PN} += " make"
RDEPENDS_${PN} += " autoconf automake binutils"
RDEPENDS_${PN} += " libstdc++ libstdc++-dev"
RDEPENDS_${PN} += " coreutils"
