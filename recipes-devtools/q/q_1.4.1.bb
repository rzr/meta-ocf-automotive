# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=007eeb0530ef13fc1dc164e14af28a64"

SRC_URI = "npm://registry.npmjs.org;name=q;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "A library for promises (CommonJS/Promises/A,B,D)"
HOMEPAGE = "https://github.com/kriskowal/q"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

#LICENSE_${PN} = "MIT"
