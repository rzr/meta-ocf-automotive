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
LIC_FILES_CHKSUM = "file://LICENSE;md5=3a35eb11a704bfb6b0b70f7a3b3e542a \
                    file://node_modules/onoff/LICENSE;md5=8d8dc15ae03baf275cdcc8170bbdcb98 \
                    file://node_modules/onoff/node_modules/epoll/LICENSE;md5=564c07e46fb0c4fe02285be2fcff614c \
                    file://node_modules/onoff/node_modules/epoll/node_modules/nan/LICENSE.md;md5=d7425f79f415dec8f013aa2869dd7a4e \
                    file://node_modules/q/LICENSE;md5=007eeb0530ef13fc1dc164e14af28a64"

SRC_URI = "npm://registry.npmjs.org;name=lcd;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "Hitachi HD44780 LCD driver"
#NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
#NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

do_install_append () {
    rm -rf ${D}/usr/lib/node_modules/${PN}/node_modules
}

#LICENSE_${PN}-onoff-epoll-bindings = "MIT"
#LICENSE_${PN}-onoff-epoll-nan = "MIT"
#LICENSE_${PN}-onoff-epoll = "MIT"
#LICENSE_${PN}-onoff = "MIT"
#LICENSE_${PN}-q = "MIT"
LICENSE_${PN} = "MIT"
