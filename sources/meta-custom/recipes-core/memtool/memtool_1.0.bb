FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SUMMARY = "Memtool utility for direct memory read/write ops"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://memtool.c \
	   file://eim_reg_setting.sh \
	   file://Partition.png "

S = "${WORKDIR}"

EIM_SETTINGS = "eim_reg_setting.sh"
PARTITION = "Partition.png"

BBFILE_PRIORITY="99999999999"
FILES_${PN} += "/home/root/* "
FILES_${PN} += "/home/unit_tests/* "
ALLOW_EMPTY_${PN} = "1"

INSANE_SKIP_${PN} = "installed-vs-shipped " 


do_compile() {
    ${CC} memtool.c -o memtool ${CFLAGS} 
}

do_install() {
    install -d ${D}/unit_tests/
    install -m 0755 memtool ${D}/unit_tests/
}

do_install_append() {
install -d ${D}/home/root/
install -m 0755 ${EIM_SETTINGS} ${D}/home/root/
install -m 0755 ${PARTITION} ${D}/home/root/
}
