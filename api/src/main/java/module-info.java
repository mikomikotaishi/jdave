module club.minnced.discord.jdave {
    requires java.base;
    requires transitive net.dv8tion.jda;
    requires org.jspecify;
    requires org.slf4j;

    exports club.minnced.discord.jdave;
    exports club.minnced.discord.jdave.ffi;
    exports club.minnced.discord.jdave.interop;
    exports club.minnced.discord.jdave.manager;
    exports club.minnced.discord.jdave.utils;
}
