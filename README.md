# CSGOItemParserForWeaponsPlugin
A simple tool to generate skin config files for CS:GO Weapons plugin

Usage: java -jar weaponsconfig.jar < path_to_csgo_folder > < language >

Example (windows): java -jar weaponsconfig.jar "D:\Program Files\Steam\steamapps\common\Counter-Strike Global Offensive\csgo" english

Example (linux): java -jar weaponsconfig.jar /home/user/server/csgo english

Output will be created in addons/sourcemod/configs/weapons/ folder

## Lombok
For right compiling use this as external library: https://projectlombok.org/download
