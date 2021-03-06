#
#   Copyright (C) 2015 Pelagicore AB
#   All rights reserved.
#
DESCRIPTION = "dbus-proxy"
HOMEPAGE = "http://www.pelagicore.com"
LICENSE = "LGPLv2.1"
PR = "r0"

inherit cmake

LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "dbus dbus-glib glib-2.0 jansson"

SRC_URI = "git://github.com/Pelagicore/dbus-proxy.git;protocol=https;branch=master"
SRCREV = "b499f4d6aa6e57900c316cb6f264ca9952e9697c"
PV = "0.1+git${SRCREV}"

S = "${WORKDIR}/git/"

