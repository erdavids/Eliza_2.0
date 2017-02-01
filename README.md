#(WIP) Hopefully an upgrade to the original ELIZA AI Program

I have always been interested in natural language processing (as seen in my other text based projects), and I thought it
would be an interesting project to try and expand the ELIZA program from so long ago.

The project will begin fairly thin, with only a few possible conversation topics, such as...
+ Mood
+ Personal History

Eliza 2.0 should eventually be able to remember past messages from the user.

An amazing feature would be the ability for a conversation to slowly create a JSON, so that upon starting a new Conversation,
Eliza 2.0 could "remember" the person talking and ask for clarification or updates on old conversation topics, such as
relationships, etc. 

Eliza 2.0 will use a priority system that will calculated priority for each topic based on the reaction or repetition from 
the user. For example, if the user continually mentions the name "Susan", Eliza 2.0 will continue adding priority to that
topic. Eliza should always try to steer lightly away from the current prioritized topic so that other conversations can be had.
