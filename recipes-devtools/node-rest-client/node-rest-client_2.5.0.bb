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
LICENSE = "ISC & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61adcd5bf5c963eaf9b44f2d052facca \
                    file://node_modules/xml2js/LICENSE;md5=d9fc599c8d9e6f8665063862aac66dfc \
                    file://node_modules/xml2js/node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/xml2js/node_modules/xmlbuilder/LICENSE;md5=eb65a7137aed46eac98ceb8cb8b057a1 \
                    file://node_modules/xml2js/node_modules/xmlbuilder/node_modules/lodash/LICENSE;md5=8f10c81975f996c3ba5b424884b4af96 \
                    file://node_modules/follow-redirects/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/follow-redirects/node_modules/debug/node_modules/ms/LICENSE.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/debug/node_modules/ms/LICENSE;md5=2be2157b55ea281b7f4969d7ba05eea2"

SRC_URI = "npm://registry.npmjs.org;name=node-rest-client;version=${PV}"

S = "${WORKDIR}/npmpkg"

SUMMARY = "node API REST client"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-follow-redirects-debug-ms = "MIT"
LICENSE_${PN}-follow-redirects-debug = "MIT"
LICENSE_${PN}-follow-redirects = "MIT"
LICENSE_${PN}-xml2js-sax = "ISC"
LICENSE_${PN}-xml2js-xmlbuilder-lodash = "MIT"
LICENSE_${PN}-xml2js-xmlbuilder = "MIT"
LICENSE_${PN}-xml2js = "MIT"
LICENSE_${PN} = "MIT"
