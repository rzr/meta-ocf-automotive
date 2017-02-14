DESCRIPTION = "OCF Automotive full package set including examples"
LICENSE = "Apache-2.0"

inherit packagegroup

PACKAGES = "packagegroup-ocf-automotive"
ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += " packagegroup-iotivity"

# IoTivity
RDEPENDS_${PN} += " iotivity-example"
RDEPENDS_${PN} += " iotivity-example-geolocation"
RDEPENDS_${PN} += " iotivity-example-switch"

# Utilities
RDEPENDS_${PN} += " os-release"
RDEPENDS_${PN} += " screen"
RDEPENDS_${PN} += " sudo"
