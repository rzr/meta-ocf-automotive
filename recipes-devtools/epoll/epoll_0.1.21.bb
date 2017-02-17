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
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=564c07e46fb0c4fe02285be2fcff614c \
                    file://node_modules/nan/LICENSE.md;md5=d7425f79f415dec8f013aa2869dd7a4e"

SRC_URI = "npm://registry.npmjs.org;name=epoll;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "A low-level Node.js binding for the Linux epoll API"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-bindings = "MIT"
LICENSE_${PN}-nan = "MIT"
LICENSE_${PN} = "MIT"
