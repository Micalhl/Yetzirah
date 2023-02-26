package me.mical.yetzirah.core.marriage

import org.bukkit.entity.Player

/**
 * Yetzirah
 * me.mical.yetzirah.core.marriage.MarriageManager
 *
 * @author mical
 * @since 2023/2/26 4:01 PM
 */
interface MarriageManager {

    fun initialize()

    fun getMarriages()

    fun get(player: Player): Marriage
}