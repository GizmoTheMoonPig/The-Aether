package com.aetherteam.aether.data.generators;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.client.AetherSoundEvents;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

public class AetherSoundData extends SoundDefinitionsProvider {
    public AetherSoundData(PackOutput output, ExistingFileHelper helper) {
        super(output, Aether.MODID, helper);
    }

    @Override
    public void registerSounds() {
        // Blocks
        this.add(AetherSoundEvents.BLOCK_AETHER_PORTAL_AMBIENT,
                definition().with(sound("minecraft:portal/portal").attenuationDistance(10))
                        .subtitle("subtitles.aether.block.aether_portal.ambient")
        );
        this.add(AetherSoundEvents.BLOCK_AETHER_PORTAL_TRAVEL,
                definition().with(sound("minecraft:portal/travel"))
        );
        this.add(AetherSoundEvents.BLOCK_AETHER_PORTAL_TRIGGER,
                definition().with(sound("minecraft:portal/trigger"))
                        .subtitle("subtitles.aether.block.aether_portal.trigger")
        );
        this.add(AetherSoundEvents.BLOCK_CHEST_MIMIC_OPEN,
                definition().with(sound("minecraft:block/chest/open"))
                        .subtitle("subtitles.aether.block.chest_mimic.open")
        );
        this.add(AetherSoundEvents.BLOCK_ALTAR_CRACKLE,
                definition().with(
                        sound("minecraft:block/furnace/fire_crackle1"),
                        sound("minecraft:block/furnace/fire_crackle2"),
                        sound("minecraft:block/furnace/fire_crackle3"),
                        sound("minecraft:block/furnace/fire_crackle4"),
                        sound("minecraft:block/furnace/fire_crackle5")
                ).subtitle("subtitles.aether.block.altar.crackle")
        );
        this.add(AetherSoundEvents.BLOCK_FREEZER_CRACKLE,
                definition().with(
                        sound("minecraft:block/furnace/fire_crackle1"),
                        sound("minecraft:block/furnace/fire_crackle2"),
                        sound("minecraft:block/furnace/fire_crackle3"),
                        sound("minecraft:block/furnace/fire_crackle4"),
                        sound("minecraft:block/furnace/fire_crackle5")
                ).subtitle("subtitles.aether.block.freezer.crackle")
        );
        this.add(AetherSoundEvents.BLOCK_INCUBATOR_CRACKLE,
                definition().with(
                        sound("minecraft:block/furnace/fire_crackle1"),
                        sound("minecraft:block/furnace/fire_crackle2"),
                        sound("minecraft:block/furnace/fire_crackle3"),
                        sound("minecraft:block/furnace/fire_crackle4"),
                        sound("minecraft:block/furnace/fire_crackle5")
                ).subtitle("subtitles.aether.block.incubator.crackle")
        );
        this.add(AetherSoundEvents.BLOCK_DUNGEON_TRAP_TRIGGER,
                definition().with(
                        sound("aether:block/dungeon_trap/trigger1"),
                        sound("aether:block/dungeon_trap/trigger2"),
                        sound("aether:block/dungeon_trap/trigger3"),
                        sound("aether:block/dungeon_trap/trigger4"),
                        sound("aether:block/dungeon_trap/trigger5"),
                        sound("aether:block/dungeon_trap/trigger6")
                ).subtitle("subtitles.aether.block.dungeon_trap.trigger")
        );
        this.add(AetherSoundEvents.WATER_EVAPORATE,
                definition().with(sound("minecraft:random/fizz")
                ).subtitle("subtitles.aether.block.water.evaporate")
        );


        //Items
        this.add(AetherSoundEvents.ITEM_AMBROSIUM_SHARD,
                definition().with(sound("minecraft:block/amethyst/shimmer"))
                        .subtitle("subtitles.aether.item.ambrosium_shard.use")
        );
        this.add(AetherSoundEvents.ITEM_SWET_BALL_USE,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.item.swet_ball.use")
        );
        this.add(AetherSoundEvents.ITEM_DART_SHOOTER_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                        .subtitle("subtitles.aether.item.dart_shooter.shoot")
        );
        this.add(AetherSoundEvents.ITEM_LIGHTNING_KNIFE_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                        .subtitle("subtitles.aether.item.lightning_knife.shoot")
        );
        this.add(AetherSoundEvents.ITEM_HAMMER_OF_KINGBDOGZ_SHOOT,
                definition().with(sound("minecraft:mob/ghast/fireball4"))
                        .subtitle("subtitles.aether.item.hammer_of_kingbdogz.shoot")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_ZANITE,
                definition().with(
                        sound("minecraft:item/armor/equip_diamond1"),
                        sound("minecraft:item/armor/equip_diamond2"),
                        sound("minecraft:item/armor/equip_diamond3"),
                        sound("minecraft:item/armor/equip_diamond4"),
                        sound("minecraft:item/armor/equip_diamond5"),
                        sound("minecraft:item/armor/equip_diamond6")
                ).subtitle("subtitles.aether.item.armor.equip_zanite")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_GRAVITITE,
                definition().with(
                        sound("minecraft:item/armor/equip_gold1"),
                        sound("minecraft:item/armor/equip_gold2"),
                        sound("minecraft:item/armor/equip_gold3"),
                        sound("minecraft:item/armor/equip_gold4"),
                        sound("minecraft:item/armor/equip_gold5"),
                        sound("minecraft:item/armor/equip_gold6")
                ).subtitle("subtitles.aether.item.armor.equip_gravitite")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_VALKYRIE,
                definition().with(
                        sound("minecraft:item/armor/equip_iron1"),
                        sound("minecraft:item/armor/equip_iron2"),
                        sound("minecraft:item/armor/equip_iron3"),
                        sound("minecraft:item/armor/equip_iron4"),
                        sound("minecraft:item/armor/equip_iron5"),
                        sound("minecraft:item/armor/equip_iron6")
                ).subtitle("subtitles.aether.item.armor.equip_valkyrie")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_NEPTUNE,
                definition().with(
                        sound("minecraft:item/armor/equip_gold1"),
                        sound("minecraft:item/armor/equip_gold2"),
                        sound("minecraft:item/armor/equip_gold3"),
                        sound("minecraft:item/armor/equip_gold4"),
                        sound("minecraft:item/armor/equip_gold5"),
                        sound("minecraft:item/armor/equip_gold6")
                ).subtitle("subtitles.aether.item.armor.equip_neptune")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_PHOENIX,
                definition().with(
                        sound("minecraft:item/armor/equip_iron1"),
                        sound("minecraft:item/armor/equip_iron2"),
                        sound("minecraft:item/armor/equip_iron3"),
                        sound("minecraft:item/armor/equip_iron4"),
                        sound("minecraft:item/armor/equip_iron5"),
                        sound("minecraft:item/armor/equip_iron6")
                ).subtitle("subtitles.aether.item.armor.equip_phoenix")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_OBSIDIAN,
                definition().with(
                        sound("minecraft:item/armor/equip_netherite1"),
                        sound("minecraft:item/armor/equip_netherite2"),
                        sound("minecraft:item/armor/equip_netherite3"),
                        sound("minecraft:item/armor/equip_netherite4")
                ).subtitle("subtitles.aether.item.armor.equip_obsidian")
        );
        this.add(AetherSoundEvents.ITEM_ARMOR_EQUIP_SENTRY,
                definition().with(
                        sound("minecraft:item/armor/equip_netherite1"),
                        sound("minecraft:item/armor/equip_netherite2"),
                        sound("minecraft:item/armor/equip_netherite3"),
                        sound("minecraft:item/armor/equip_netherite4")
                ).subtitle("subtitles.aether.item.armor.equip_sentry")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_GENERIC,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_generic")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_IRON_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_iron_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_GOLD_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_gold_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_zanite_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ICE_RING,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_ice_ring")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_IRON_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_iron_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_GOLD_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_gold_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_zanite_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ICE_PENDANT,
                definition().with(
                        sound("minecraft:item/armor/equip_chain1"),
                        sound("minecraft:item/armor/equip_chain2"),
                        sound("minecraft:item/armor/equip_chain3"),
                        sound("minecraft:item/armor/equip_chain4"),
                        sound("minecraft:item/armor/equip_chain5"),
                        sound("minecraft:item/armor/equip_chain6")
                ).subtitle("subtitles.aether.item.accessory.equip_ice_pendant")
        );
        this.add(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_CAPE,
                definition().with(
                        sound("minecraft:item/armor/equip_leather1"),
                        sound("minecraft:item/armor/equip_leather2"),
                        sound("minecraft:item/armor/equip_leather3"),
                        sound("minecraft:item/armor/equip_leather4"),
                        sound("minecraft:item/armor/equip_leather5"),
                        sound("minecraft:item/armor/equip_leather6")
                ).subtitle("subtitles.aether.item.accessory.equip_cape")
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_AETHER_TUNE,
                definition().with(sound("aether:item/records/aether_tune").stream())
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_ASCENDING_DAWN,
                definition().with(sound("aether:item/records/ascending_dawn").stream())
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_CHINCHILLA,
                definition().with(sound("aether:item/records/chinchilla").stream())
        );
        this.add(AetherSoundEvents.ITEM_MUSIC_DISC_HIGH,
                definition().with(sound("aether:item/records/high").stream())
        );


        //Entities
        this.add(AetherSoundEvents.ENTITY_PHYG_AMBIENT,
                definition().with(
                        sound("minecraft:mob/pig/say1"),
                        sound("minecraft:mob/pig/say2"),
                        sound("minecraft:mob/pig/say3")
                ).subtitle("subtitles.aether.entity.phyg.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_DEATH,
                definition().with(sound("minecraft:mob/pig/death"))
                        .subtitle("subtitles.aether.entity.phyg.death")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_HURT,
                definition().with(
                        sound("minecraft:mob/pig/say1"),
                        sound("minecraft:mob/pig/say2"),
                        sound("minecraft:mob/pig/say3")
                ).subtitle("subtitles.aether.entity.phyg.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_SADDLE,
                definition().with(sound("minecraft:mob/horse/leather"))
                        .subtitle("subtitles.aether.entity.phyg.saddle")
        );
        this.add(AetherSoundEvents.ENTITY_PHYG_STEP,
                definition().with(
                        sound("minecraft:mob/pig/step1"),
                        sound("minecraft:mob/pig/step2"),
                        sound("minecraft:mob/pig/step3"),
                        sound("minecraft:mob/pig/step4"),
                        sound("minecraft:mob/pig/step5")
                ).subtitle("subtitles.block.generic.footsteps")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_AMBIENT,
                definition().with(
                        sound("minecraft:mob/cow/say1"),
                        sound("minecraft:mob/cow/say2"),
                        sound("minecraft:mob/cow/say3"),
                        sound("minecraft:mob/cow/say4")
                ).subtitle("subtitles.aether.entity.flying_cow.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_DEATH,
                definition().with(
                        sound("minecraft:mob/cow/hurt1"),
                        sound("minecraft:mob/cow/hurt2"),
                        sound("minecraft:mob/cow/hurt3")
                ).subtitle("subtitles.aether.entity.flying_cow.death")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_HURT,
                definition().with(
                        sound("minecraft:mob/cow/hurt1"),
                        sound("minecraft:mob/cow/hurt2"),
                        sound("minecraft:mob/cow/hurt3")
                ).subtitle("subtitles.aether.entity.flying_cow.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_SADDLE,
                definition().with(sound("minecraft:mob/horse/leather"))
                        .subtitle("subtitles.aether.entity.flying_cow.saddle")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_MILK,
                definition().with(
                        sound("minecraft:entity/cow/milk1"),
                        sound("minecraft:entity/cow/milk2"),
                        sound("minecraft:entity/cow/milk3")
                ).subtitle("subtitles.aether.entity.flying_cow.milk")
        );
        this.add(AetherSoundEvents.ENTITY_FLYING_COW_STEP,
                definition().with(
                        sound("minecraft:mob/cow/step1"),
                        sound("minecraft:mob/cow/step2"),
                        sound("minecraft:mob/cow/step3"),
                        sound("minecraft:mob/cow/step4")
                ).subtitle("subtitles.block.generic.footsteps")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_AMBIENT,
                definition().with(
                        sound("minecraft:mob/sheep/say1"),
                        sound("minecraft:mob/sheep/say2"),
                        sound("minecraft:mob/sheep/say3")
                ).subtitle("subtitles.aether.entity.sheepuff.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_DEATH,
                definition().with(
                        sound("minecraft:mob/sheep/say1"),
                        sound("minecraft:mob/sheep/say2"),
                        sound("minecraft:mob/sheep/say3")
                ).subtitle("subtitles.aether.entity.sheepuff.death")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_HURT,
                definition().with(
                        sound("minecraft:mob/sheep/say1"),
                        sound("minecraft:mob/sheep/say2"),
                        sound("minecraft:mob/sheep/say3")
                ).subtitle("subtitles.aether.entity.sheepuff.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_SHEAR,
                definition().with(sound("minecraft:mob/sheep/shear"))
                        .subtitle("subtitles.item.shears.shear")
        );
        this.add(AetherSoundEvents.ENTITY_SHEEPUFF_STEP,
                definition().with(
                        sound("minecraft:mob/sheep/step1"),
                        sound("minecraft:mob/sheep/step2"),
                        sound("minecraft:mob/sheep/step3"),
                        sound("minecraft:mob/sheep/step4"),
                        sound("minecraft:mob/sheep/step5")
                ).subtitle("subtitles.block.generic.footsteps")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_AMBIENT,
                definition().with(sound("aether:entity/moa/say"))
                        .subtitle("subtitles.aether.entity.moa.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_DEATH,
                definition().with(sound("aether:entity/moa/say"))
                        .subtitle("subtitles.aether.entity.moa.death")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_HURT,
                definition().with(sound("aether:entity/moa/say"))
                        .subtitle("subtitles.aether.entity.moa.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_SADDLE,
                definition().with(sound("minecraft:mob/horse/leather"))
                        .subtitle("subtitles.aether.entity.moa.saddle")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_STEP,
                definition().with(
                        sound("minecraft:mob/pig/step1"),
                        sound("minecraft:mob/pig/step2"),
                        sound("minecraft:mob/pig/step3"),
                        sound("minecraft:mob/pig/step4"),
                        sound("minecraft:mob/pig/step5")
                ).subtitle("subtitles.block.generic.footsteps")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_FLAP,
                definition().with(sound("minecraft:mob/bat/takeoff"))
                        .subtitle("subtitles.aether.entity.moa.flap")
        );
        this.add(AetherSoundEvents.ENTITY_MOA_EGG,
                definition().with(sound("minecraft:mob/chicken/plop"))
                        .subtitle("subtitles.aether.entity.moa.egg")
        );
        this.add(AetherSoundEvents.ENTITY_AERWHALE_AMBIENT,
                definition().with(sound("aether:entity/aerwhale/call"))
                        .subtitle("subtitles.aether.entity.aerwhale.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_AERWHALE_DEATH,
                definition().with(sound("aether:entity/aerwhale/death"))
                        .subtitle("subtitles.aether.entity.aerwhale.death")
        );
        this.add(AetherSoundEvents.ENTITY_AERWHALE_HURT,
                definition().with(sound("aether:entity/aerwhale/death"))
                        .subtitle("subtitles.aether.entity.aerwhale.death")
        );
        this.add(AetherSoundEvents.ENTITY_AERBUNNY_DEATH,
                definition().with(sound("aether:entity/aerbunny/death"))
                        .subtitle("subtitles.aether.entity.aerbunny.death")
        );
        this.add(AetherSoundEvents.ENTITY_AERBUNNY_HURT,
                definition().with(sound("aether:entity/aerbunny/hurt"))
                        .subtitle("subtitles.aether.entity.aerbunny.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_AERBUNNY_LIFT,
                definition().with(sound("aether:entity/aerbunny/lift"))
                        .subtitle("subtitles.aether.entity.aerbunny.lift")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_ATTACK,
                definition().with(
                        sound("minecraft:mob/slime/attack1"),
                        sound("minecraft:mob/slime/attack2")
                ).subtitle("subtitles.aether.entity.swet.attack")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_DEATH,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.entity.swet.death")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_HURT,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.entity.swet.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_JUMP,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.entity.swet.squish")
        );
        this.add(AetherSoundEvents.ENTITY_SWET_SQUISH,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.entity.swet.squish")
        );
        this.add(AetherSoundEvents.ENTITY_WHIRLWIND_DROP,
                definition().with(sound("minecraft:random/pop"))
                        .subtitle("subtitles.aether.entity.item.pickup")
        );
        this.add(AetherSoundEvents.ENTITY_AECHOR_PLANT_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                        .subtitle("subtitles.aether.entity.aechor_plant.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_AECHOR_PLANT_HURT,
                definition().with(
                        sound("minecraft:damage/hit1"),
                        sound("minecraft:damage/hit2"),
                        sound("minecraft:damage/hit3")
                ).subtitle("subtitles.aether.entity.aechor_plant.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_AECHOR_PLANT_DEATH,
                definition().with(sound("minecraft:damage/fallbig"))
                        .subtitle("subtitles.aether.entity.aechor_plant.death")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_SHOOT,
                definition().with(sound("minecraft:random/bow"))
                        .subtitle("subtitles.aether.entity.cockatrice.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_AMBIENT,
                definition().with(sound("aether:entity/moa/say"))
                        .subtitle("subtitles.aether.entity.cockatrice.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_DEATH,
                definition().with(sound("aether:entity/moa/say"))
                        .subtitle("subtitles.aether.entity.cockatrice.death")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_HURT,
                definition().with(sound("aether:entity/moa/say"))
                        .subtitle("subtitles.aether.entity.cockatrice.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_COCKATRICE_FLAP,
                definition().with(sound("minecraft:mob/bat/takeoff"))
                        .subtitle("subtitles.aether.entity.cockatrice.flap")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_SHOOT,
                definition().with(sound("aether:entity/zephyr/shoot"))
                        .subtitle("subtitles.aether.entity.zephyr.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_AMBIENT,
                definition().with(sound("aether:entity/zephyr/call"))
                        .subtitle("subtitles.aether.entity.zephyr.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_DEATH,
                definition().with(sound("aether:entity/zephyr/call"))
                        .subtitle("subtitles.aether.entity.zephyr.death")
        );
        this.add(AetherSoundEvents.ENTITY_ZEPHYR_HURT,
                definition().with(sound("aether:entity/zephyr/call"))
                        .subtitle("subtitles.aether.entity.zephyr.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SENTRY_DEATH,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.entity.sentry.death")
        );
        this.add(AetherSoundEvents.ENTITY_SENTRY_HURT,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.entity.sentry.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SENTRY_JUMP,
                definition().with(
                        sound("minecraft:mob/slime/big1"),
                        sound("minecraft:mob/slime/big2"),
                        sound("minecraft:mob/slime/big3"),
                        sound("minecraft:mob/slime/big4")
                ).subtitle("subtitles.aether.entity.sentry.jump")
        );
        this.add(AetherSoundEvents.ENTITY_MIMIC_ATTACK,
                definition().with(
                        sound("minecraft:random/eat1"),
                        sound("minecraft:random/eat2"),
                        sound("minecraft:random/eat3")
                ).subtitle("subtitles.aether.entity.mimic.attack")
        );
        this.add(AetherSoundEvents.ENTITY_MIMIC_DEATH,
                definition().with(
                        sound("minecraft:block/chest/close1"),
                        sound("minecraft:block/chest/close2"),
                        sound("minecraft:block/chest/close3")
                ).subtitle("subtitles.aether.entity.mimic.death")
        );
        this.add(AetherSoundEvents.ENTITY_MIMIC_HURT,
                definition().with(
                        sound("minecraft:dig/wood1"),
                        sound("minecraft:dig/wood2"),
                        sound("minecraft:dig/wood3"),
                        sound("minecraft:dig/wood4")
                ).subtitle("subtitles.aether.entity.mimic.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_MIMIC_KILL,
                definition().with(
                        sound("minecraft:random/burp")
                ).subtitle("subtitles.aether.entity.mimic.kill")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_AWAKEN,
                definition().with(sound("aether:entity/slider/awaken"))
                        .subtitle("subtitles.aether.entity.slider.awaken")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_AMBIENT,
                definition().with(sound("minecraft:ambient/cave/cave1"),
                                sound("minecraft:ambient/cave/cave2"),
                                sound("minecraft:ambient/cave/cave3"),
                                sound("minecraft:ambient/cave/cave4"),
                                sound("minecraft:ambient/cave/cave5"),
                                sound("minecraft:ambient/cave/cave6"),
                                sound("minecraft:ambient/cave/cave7"),
                                sound("minecraft:ambient/cave/cave8"),
                                sound("minecraft:ambient/cave/cave9"),
                                sound("minecraft:ambient/cave/cave10"),
                                sound("minecraft:ambient/cave/cave11"),
                                sound("minecraft:ambient/cave/cave12"),
                                sound("minecraft:ambient/cave/cave13"),
                                sound("minecraft:ambient/cave/cave14"),
                                sound("minecraft:ambient/cave/cave15"),
                                sound("minecraft:ambient/cave/cave16"),
                                sound("minecraft:ambient/cave/cave17"),
                                sound("minecraft:ambient/cave/cave18"),
                                sound("minecraft:ambient/cave/cave19"))
                        .subtitle("subtitles.aether.entity.slider.ambient")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_COLLIDE,
                definition().with(sound("aether:entity/slider/collide"))
                        .subtitle("subtitles.aether.entity.slider.collide")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_MOVE,
                definition().with(sound("aether:entity/slider/move"))
                        .subtitle("subtitles.aether.entity.slider.move")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_HURT,
                definition().with(sound("minecraft:step/stone1"),
                                sound("minecraft:step/stone2"),
                                sound("minecraft:step/stone3"),
                                sound("minecraft:step/stone4"),
                                sound("minecraft:step/stone5"),
                                sound("minecraft:step/stone6"))
                        .subtitle("subtitles.aether.entity.slider.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SLIDER_DEATH,
                definition().with(sound("aether:entity/slider/death"))
                        .subtitle("subtitles.aether.entity.slider.death")
        );
        this.add(AetherSoundEvents.ENTITY_VALKYRIE_DEATH,
                definition().with(sound("damage/hit1"),
                                sound("damage/hit2"),
                                sound("damage/hit3"))
                        .subtitle("subtitles.aether.entity.valkyrie.death")
        );
        this.add(AetherSoundEvents.ENTITY_VALKYRIE_HURT,
                definition().with(sound("damage/hit1"),
                                sound("damage/hit2"),
                                sound("damage/hit3"))
                        .subtitle("subtitles.aether.entity.valkyrie.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_VALKYRIE_QUEEN_DEATH,
                definition().with(sound("damage/hit1"),
                                sound("damage/hit2"),
                                sound("damage/hit3"))
                        .subtitle("subtitles.aether.entity.valkyrie_queen.death")
        );
        this.add(AetherSoundEvents.ENTITY_VALKYRIE_QUEEN_HURT,
                definition().with(sound("damage/hit1"),
                                sound("damage/hit2"),
                                sound("damage/hit3"))
                        .subtitle("subtitles.aether.entity.valkyrie_queen.hurt")
        );
        this.add(AetherSoundEvents.ENTITY_SUN_SPIRIT_SHOOT,
                definition().with(sound("minecraft:mob/ghast/fireball4"))
                        .subtitle("subtitles.aether.entity.sun_spirit.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_CLOUD_MINION_SHOOT,
                definition().with(sound("aether:entity/zephyr/shoot"))
                        .subtitle("subtitles.aether.entity.cloud_minion.shoot")
        );
        this.add(AetherSoundEvents.ENTITY_CLOUD_CRYSTAL_EXPLODE,
                definition().with(
                        sound("minecraft:random/glass1"),
                        sound("minecraft:random/glass2"),
                        sound("minecraft:random/glass3")
                ).subtitle("subtitles.aether.entity.cloud_crystal.explode")
        );
        this.add(AetherSoundEvents.ENTITY_FIRE_CRYSTAL_EXPLODE,
                definition().with(
                        sound("minecraft:random/explode1"),
                        sound("minecraft:random/explode2"),
                        sound("minecraft:random/explode3"),
                        sound("minecraft:random/explode4")
                ).subtitle("subtitles.aether.entity.fire_crystal.explode")
        );
        this.add(AetherSoundEvents.ENTITY_ICE_CRYSTAL_EXPLODE,
                definition().with(
                        sound("minecraft:random/glass1"),
                        sound("minecraft:random/glass2"),
                        sound("minecraft:random/glass3")
                ).subtitle("subtitles.aether.entity.ice_crystal.explode")
        );
        this.add(AetherSoundEvents.ENTITY_THUNDER_CRYSTAL_EXPLODE,
                definition().with(
                        sound("minecraft:random/glass1"),
                        sound("minecraft:random/glass2"),
                        sound("minecraft:random/glass3")
                ).subtitle("subtitles.aether.entity.thunder_crystal.explode")
        );
        this.add(AetherSoundEvents.ENTITY_DART_HIT,
                definition().with(sound("aether:entity/projectile/shoot"))
                        .subtitle("subtitles.aether.entity.dart.hit")
        );


        //UI
        this.add(AetherSoundEvents.UI_TOAST_AETHER_GENERAL,
                definition().with(sound("aether:achievement/achievement_gen").stream())
        );
        this.add(AetherSoundEvents.UI_TOAST_AETHER_BRONZE,
                definition().with(sound("aether:achievement/achievement_bronze").stream())
        );
        this.add(AetherSoundEvents.UI_TOAST_AETHER_SILVER,
                definition().with(sound("aether:achievement/achievement_silver").stream())
        );


        //Music
        this.add(AetherSoundEvents.MUSIC_MENU,
                definition().with(sound("aether:music/menu").stream())
        );
        this.add(AetherSoundEvents.MUSIC_AETHER,
                definition().with(
                        sound("aether:music/aether1").stream(),
                        sound("aether:music/aether2").stream(),
                        sound("aether:music/aether3").stream(),
                        sound("aether:music/aether4").stream(),
                        sound("aether:music/aether5").stream()
                )
        );
    }
}
