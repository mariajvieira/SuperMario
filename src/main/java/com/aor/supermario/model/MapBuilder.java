package com.aor.supermario.model;

import com.aor.supermario.elements.*;

import java.util.List;

public abstract class MapBuilder {
    public Map createMap() {
        Map map = new Map(getWidth(), getHeight());

        map.setPlayer(createPlayer());
        map.setGrounds(createGrounds());
        map.setBlocks(createBlocks());
        map.setStairs(createStairs());
        map.setMysteryBlocks(createMysteryBlocks());
        map.setCoins(createCoins());
        map.setPipes(createPipes());
        map.setGoalPoles(createGoalPole());
        map.setRedMushrooms(createRedMushrooms());
        //Map.setMonsters(createMonsters());

        return map;
    }

    protected abstract int getWidth();
    protected abstract int getHeight();
    protected abstract List<Ground> createGrounds();
    protected abstract List<Stair> createStairs();
    protected abstract List<Block> createBlocks();
    protected abstract List<MysteryBlock> createMysteryBlocks();
    protected abstract List<Coin> createCoins();
    protected abstract List<RedMushroom> createRedMushrooms();
    protected abstract List<Pipe> createPipes();
    protected abstract List<GoalPole> createGoalPole();
    protected abstract Player createPlayer();
    //protected abstract List<Map> createMonsters();
}
