package me.mical.yetzirah.boot

import me.mical.yetzirah.core.marriage.MarriageManager
import me.mical.yetzirah.impl.marriage.DefaultMarriageManager
import taboolib.common.platform.PlatformFactory
import taboolib.common.platform.Plugin

/**
 * Yetzirah
 * me.mical.yetzirah.boot.YetzirahBooster
 *
 * @author mical
 * @since 2023/2/26 4:00 PM
 */
object YetzirahBooster : Plugin() {

    override fun onEnable() {
        PlatformFactory.registerAPI<MarriageManager>(DefaultMarriageManager().also { it.initialize() })
    }
}