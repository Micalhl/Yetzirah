package me.mical.yetzirah.core

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
}