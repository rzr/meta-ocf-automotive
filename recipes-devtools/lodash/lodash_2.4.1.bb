# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0c477f563d7508de151a4d1506411b3b"

SRC_URI = "npm://registry.npmjs.org;name=lodash;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "A utility library delivering consistency, customization, performance, & extras."
HOMEPAGE = "http://lodash.com/"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN} = "MIT"
