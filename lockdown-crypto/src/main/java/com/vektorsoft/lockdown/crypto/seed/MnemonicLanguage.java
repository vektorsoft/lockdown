/*
 * Copyright (C) 2017 Vektorsoft Ltd. (http://www.vektorsoft.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.vektorsoft.lockdown.crypto.seed;

/**
 *
 * @author Vladimir Djurovic <vdjurovic@vektorsoft.com>
 */
public enum MnemonicLanguage {
    ENGLISH ("English"),
    SPANISH ("Espanol"),
    CHINESE_TRADITIONALLL ("Chinese (Traditional)"),
    CHINESE_SIMPLIFIED ("Chinese (Simplified)"),
    JAPANESE ("Japanese"),
    FRENCH ("French"),
    ITALIAN ("Italian");
    
    private MnemonicLanguage(String title) {
        this.title = title;
    }
    
    private final String title;

    @Override
    public String toString() {
        return title;
    }
    
    
    
}
