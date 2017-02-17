# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=365dd94f3b619ca5566e5fb51f32c0e6"

SRC_URI = "npm://registry.npmjs.org;name=nan;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Native Abstractions for Node.js: C++ header for Node 0.8 -> 6 compatibility"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "MIT"
