DESCRIPTION = "OCF Automotive full package set including examples"
LICENSE = "Apache-2.0"

inherit packagegroup

PACKAGES = "packagegroup-ocf-automotive"
ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += " packagegroup-iotivity"

# Dummy resource"/DummyResURI"
RDEPENDS_${PN} += " iotivity-example-dummy"

# Binary resource"/BinaryResURI"
RDEPENDS_${PN} += " iotivity-example-switch"

# Other resources
RDEPENDS_${PN} += " iotivity-example-geolocation"

# Utilities
RDEPENDS_${PN} += " git"
RDEPENDS_${PN} += " screen"
RDEPENDS_${PN} += " sudo"
RDEPENDS_${PN} += " systemd-serialgetty util-linux-agetty"
RDEPENDS_${PN} += " os-release"
RDEPENDS_${PN} += " python-smartpm"
RDEPENDS_${PN} += " nano"
RDEPENDS_${PN} += " file"
RDEPENDS_${PN} += " grep"
RDEPENDS_${PN} += " expect"
RDEPENDS_${PN} += " zile"


