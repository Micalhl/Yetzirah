package me.mical.yetzirah.core.marriage

import java.util.UUID

/**
 * Yetzirah
 * me.mical.yetzirah.core.marriage.Marriage
 *
 * @author mical
 * @since 2023/2/26 4:02 PM
 */
data class Marriage(val uuid: UUID, val husband: UUID, val wife: UUID)
