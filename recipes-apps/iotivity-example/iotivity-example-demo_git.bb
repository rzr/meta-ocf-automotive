PR = "r0"
SUMMARY = "IoTivity Switch Example"
DESCRIPTION = "Minimalist Iotivity Client/Server application that share a resource"
HOMEPAGE = "https://github.com/TizenTeam/iotivity-example"
SECTION = "apps"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "sandbox/pcoval/demo"
SRC_URI = "git://github.com/TizenTeam/iotivity-example.git/;protocol=http;nobranch=1"

S = "${WORKDIR}/git"

inherit systemd pkgconfig

LOCAL_INSTALL_DIR = "/usr/lib/node_modules/iotivity-node/extra/js"
DEPENDS += " iotivity "
BDEPENDS += " iotivity-dev "

DEPENDS_${PN} += "iotivity-resource-dev iotivity-resource-thin-staticdev iotivity-service-dev iotivity-service-staticdev"

BBCLASSEXTEND = "native nativesdk"
RDEPENDS_${PN} += " iotivity-resource "

SYSTEMD_SERVICE_${PN} = "${PN}.service"
EXTRA_OEMAKE = " package=${PN} "
EXTRA_OEMAKE += " config_pkgconfig=1 "

# TODO: remove this workaround for iotivity-1.1.1
EXTRA_OEMAKE += " iotivity_dir=${PKG_CONFIG_SYSROOT_DIR}/usr/include/iotivity "
EXTRA_OEMAKE += " iotivity_out=${PKG_CONFIG_SYSROOT_DIR}/usr/include/iotivity "
EXTRA_OEMAKE += " iotivity_cppflags=-I${PKG_CONFIG_SYSROOT_DIR}/usr/include/iotivity/resource/stack "

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

 oe_runmake install \
  DESTDIR=${D} \
  #eol

  install -d ${D}${base_libdir}/systemd/system
  install ${S}/extra/iotivity-example.service ${D}${base_libdir}/systemd/system/${PN}.service
}

FILES_${PN} += "${LOCAL_INSTALL_DIR}/*"