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
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f342ab6475be24cd0eb9f0702d40f99 \
                    file://node_modules/i2c/LICENSE;md5=ca0e4ad78689343dfc0c4407879f0bfc \
                    file://node_modules/i2c/node_modules/nan/LICENSE.md;md5=365dd94f3b619ca5566e5fb51f32c0e6 \
                    file://node_modules/i2c/node_modules/underscore/LICENSE;md5=e5cfca0461b21ca314a0088fd5b2a236 \
                    file://node_modules/i2c/node_modules/coffee-script/LICENSE;md5=af9c124d54a584fa711f7edbca585b97 \
                    file://node_modules/lodash/LICENSE.txt;md5=0c477f563d7508de151a4d1506411b3b"

SRC_URI = "npm://registry.npmjs.org;name=bh1750;version=${PV}"

S = "${WORKDIR}/npmpkg"
RDEPENDS_${PN} += " i2c lodash"

SUMMARY = "light sensor bh1750 with raspberry pi"
#NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
#NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm


do_install_append () {
    rm -rf ${D}/usr/lib/node_modules/${PN}/node_modules
}

#LICENSE_${PN}-i2c-bindings = "MIT"
#LICENSE_${PN}-i2c-coffee-script = "MIT"
#LICENSE_${PN}-i2c-nan = "MIT"
#LICENSE_${PN}-i2c-repl = "Unknown"
#LICENSE_${PN}-i2c-underscore = "MIT"
#LICENSE_${PN}-i2c = "BSD-3-Clause-Attribution"
#LICENSE_${PN}-lodash = "MIT"
LICENSE_${PN} = "Unknown"
