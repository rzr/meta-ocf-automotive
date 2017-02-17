PR = "r1"
SUMMARY = "IoTivity Example"
DESCRIPTION = "Minimalist Iotivity Client/Server application"
HOMEPAGE = "https://github.com/TizenTeam/iotivity-example"
SECTION = "apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "sandbox/pcoval/gpio"
SRC_URI = "git://github.com/TizenTeam/iotivity-example.git/;protocol=http;nobranch=1"

S = "${WORKDIR}/git"

inherit systemd pkgconfig

LOCAL_OPT_DIR = "/opt"
LOCAL_OPT_DIR_D = "${D}${LOCAL_OPT_DIR}"

DEPENDS += " iotivity "
BDEPENDS += " iotivity-dev "

DEPENDS_${PN} += "iotivity-resource-dev iotivity-resource-thin-staticdev iotivity-service-dev iotivity-service-staticdev"

BBCLASSEXTEND = "native nativesdk"
RDEPENDS_${PN} += " iotivity-resource "

SYSTEMD_SERVICE_${PN} = "${PN}.service"
EXTRA_OEMAKE += " name=${PN}"
EXTRA_OEMAKE += " DESTDIR=${D}"

do_configure() {
}

do_compile_prepend() {
    export PKG_CONFIG_PATH="${PKG_CONFIG_PATH}"
    export PKG_CONFIG="PKG_CONFIG_SYSROOT_DIR=\"${PKG_CONFIG_SYSROOT_DIR}\" pkg-config"
    export LD_FLAGS="${LD_FLAGS}"
}

do_compile() {
    cd ${S}
    LANG=C
    export LANG
    unset DISPLAY
    LD_AS_NEEDED=1; export LD_AS_NEEDED;
    oe_runmake all
}

do_install() {
    export RPM_BUILD_ROOT=${D}
    cd ${S}
    LANG=C
    export LANG
    unset DISPLAY
    rm -rf ${D}
    install -d ${D}
    oe_runmake install
    install -d ${D}${base_libdir}/systemd/system
    install ${PN}.service \
        ${D}${base_libdir}/systemd/system/${PN}.service
}

FILES_${PN} += "${LOCAL_OPT_DIR}/${PN}/bin/*"
FILES_${PN}-dbg += "${LOCAL_OPT_DIR}/${PN}/bin/.debug"
