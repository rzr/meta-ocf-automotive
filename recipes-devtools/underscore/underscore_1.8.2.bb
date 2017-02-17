# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5cfca0461b21ca314a0088fd5b2a236"

SRC_URI = "npm://registry.npmjs.org;name=underscore;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "JavaScript's functional programming helper library."
HOMEPAGE = "http://underscorejs.org"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "MIT"
