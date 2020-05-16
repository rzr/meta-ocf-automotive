python () {
    EXTRA_OESCONS = d.getVar("EXTRA_OESCONS", True)
    EXTRA_OESCONS += " SECURED=0"
    d.setVar("EXTRA_OESCONS", EXTRA_OESCONS)
}
