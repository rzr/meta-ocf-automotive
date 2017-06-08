# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
LICENSE = "Unknown & MIT & BSD-3-Clause-Attribution"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca0e4ad78689343dfc0c4407879f0bfc \
                    file://node_modules/nan/LICENSE.md;md5=365dd94f3b619ca5566e5fb51f32c0e6 \
                    file://node_modules/underscore/LICENSE;md5=e5cfca0461b21ca314a0088fd5b2a236 \
                    file://node_modules/coffee-script/LICENSE;md5=af9c124d54a584fa711f7edbca585b97"

SRC_URI = "npm://registry.npmjs.org;name=i2c;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Native bindings for i2c-dev. Plays well with Raspberry Pi and BeagleBone."
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-bindings = "MIT"
LICENSE_${PN}-coffee-script = "MIT"
LICENSE_${PN}-nan = "MIT"
LICENSE_${PN}-repl = "Unknown"
LICENSE_${PN}-underscore = "MIT"
LICENSE_${PN} = "BSD-3-Clause-Attribution"
