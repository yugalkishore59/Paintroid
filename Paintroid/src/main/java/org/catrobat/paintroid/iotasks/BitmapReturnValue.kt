/*
 * Paintroid: An image manipulation application for Android.
 * Copyright (C) 2010-2021 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.paintroid.iotasks

import android.graphics.Bitmap
import org.catrobat.paintroid.model.CommandManagerModel

data class BitmapReturnValue(
    @JvmField
    var model: CommandManagerModel?,
    @JvmField
    var bitmapList: List<Bitmap?>?,
    @JvmField
    var bitmap: Bitmap?,
    @JvmField
    var toBeScaled: Boolean
) {
    constructor(bitmapList: List<Bitmap?>?, bitmap: Bitmap?, toBeScaled: Boolean) : this(
        null,
        bitmapList,
        bitmap,
        toBeScaled
    )

    constructor(model: CommandManagerModel?) : this(model, null, null, false)
}
