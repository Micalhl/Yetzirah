package me.mical.yetzirah.core

import me.mical.yetzirah.core.marriage.MarriageManager
import taboolib.common.platform.PlatformFactory
import taboolib.module.configuration.Config
import taboolib.module.configuration.Configuration
import taboolib.platform.BukkitPlugin

/**
 * Yetzirah
 * me.mical.yetzirah.core.Yetzirah
 *
 * @author mical
 * @since 2023/2/26 4:01 PM
 */
object Yetzirah {

    @Config
    lateinit var config: Configuration

    val plugin by lazy {
        BukkitPlugin.getInstance()
    }

    fun getMarriageManager(): MarriageManager {
        return PlatformFactory.getAPI()
    }
}