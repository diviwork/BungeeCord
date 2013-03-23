package net.md_5.bungee.api.scoreboard;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

@Data
public class Team
{

    private final String name;
    private String displayName;
    private String prefix;
    private String suffix;
    private byte friendlyMode;
    private Set<String> players = new HashSet<>();

    public Collection<String> getPlayers()
    {
        return Collections.unmodifiableSet( players );
    }
}