package br.com.alexpfx.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Jokes grabbed from: http://www.textfiles.com/humor/JOKES/shorties.jok
 */
public class JokeTeller {

    private static final JokeTeller instance = new JokeTeller();
    private static final List<String> jokeLibrary = new ArrayList<>();
    private static String jokes = "=========================================================================\n" +
            "\n" +
            "\"Freedom is just Chaos, with better lighting.\"-Alan Dean Foster \"To the\n" +
            "Vanishing Point\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "The Search for Signs of Intelligent Life in the Universe:\n" +
            "\n" +
            "All my life I said I wanted to be someone...I can see now that\n" +
            "I should have been more specific.\n" +
            "\n" +
            "=========================================================================\n" +
            "\"Stupidity, like virtue, is its own reward\"  -Bill Davidsen\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"The world is filled with fools. They blindly follow their so-called\n" +
            "'reason' in the face of the church and common sense. Any fool can see\n" +
            "that the world is flat!\" - anon\n" +
            "\n" +
            "=========================================================================\n" +
            "    \"Women and cats do as they dammed well please.\n" +
            "     Men and dogs had best learn to live with it...\"\n" +
            "\n" +
            "    Alan Holbrook\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\n" +
            "\"I'm at the corner of Walk and Don't Walk....\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "    Two obviously high-class old ladies are strolling down a city\n" +
            "    street when they run across a grizzled, ragged old derelict\n" +
            "    lying drunk in the gutter, covered with garbage, sewer water\n" +
            "    running all over him.  \"Hmmmph,\" sniffs one of the old ladies\n" +
            "    haughtily.  \"Cleanliness is next to godliness.  William Shakespeare!\"\n" +
            "\n" +
            "    The drunk opens one yellowed, rheumy old eye, stares at her\n" +
            "    balefully, and replies, \"Fuck you.  Tennessee Williams...\"\n" +
            "\n" +
            "=========================================================================\n" +
            "A retired dentist who loves to fish. \"Open wide,\" he mutters to the unseen fish\n" +
            "as he waits for a tug on the line. \"Now bite down. This may sting just a\n" +
            "little bit.\"\n" +
            "\n" +
            "Then of course, there's the way Keillor used to close his broadcast stories:\n" +
            "\"That's the news from Lake Woebegon, where all the men are smart, the women\n" +
            "are good looking, and all the children are above average.\"\n" +
            "\n" +
            "Keillor has a sort of low-key, \"Huh? Whuzzat?\" humor that I'm very fond of.\n" +
            "\n" +
            "I have a Steven King line I'm fond of too. It's from _The_Dead_Zone, and it's\n" +
            "not funny at all, but I find it to be true. Johnny Smith is talking to the\n" +
            "wealthy father of the boy he's been hired to tutor. The father says something\n" +
            "to the affect that there are three kinds of people in the world. 95 percent\n" +
            "of the people are drones, zeroes. One percent are saints and one percent\n" +
            "are devils, and that two percent are born the way they are. The other\n" +
            "three percent_the people who get the vast majority of things in the world\n" +
            "done_are the people who do what they say they will do.\n" +
            "\n" +
            "of him as a classical author and you'll have a real good time. I recommend\n" +
            "=========================================================================\n" +
            "\n" +
            "\"Sometimes a cigar is just a cigar.\" -- Sigmund Freud\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"a woman is only a woman,\n" +
            "but a good cigar is a smoke\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "                      War is an ugly thing, but not the ugliest of\n" +
            "                       things. The decayed and degraded state of\n" +
            "                       moral and patriotic feeling which thinks that\n" +
            "                       Nothing is worth war is much worse. The per-\n" +
            "                       son who has nothing for which he is willing\n" +
            "                       to fight, nothing which is more important\n" +
            "                       than his own personal safety, is a miserable\n" +
            "                       creature and has no chance of being free unless\n" +
            "                       made and kept so by the exertions of better\n" +
            "                       men than himself.\n" +
            "                                         --- John Stewart Mill\n" +
            "=========================================================================\n" +
            "\n" +
            "                      Duty  then  is the sublimest word in the\n" +
            "                      English language.  You should do your duty in\n" +
            "                      all things.  You can never do more, you should\n" +
            "                      never wish to do less.\n" +
            "                                          General Robert E. Lee\n" +
            "\n" +
            "======================================================================\n" +
            "\n" +
            "        We will occasionally use this arrow notation unless there is danger of\n" +
            "              no confusion.\n" +
            "        -- Ronald Graham, \"Rudiments of Ramsey Theory\"\n" +
            "\n" +
            "======================================================================\n" +
            "\n" +
            "        I have been assured by a very knowing American of my acquaintance\n" +
            "in London, that a young healthy child well nursed is at a year old a\n" +
            "most delicious, nourishing, and wholesome food, whether stewed, roasted,\n" +
            "baked, or boiled, and I make no doubt that it will equally serve in a\n" +
            "fricassee, or a ragout.\n" +
            "        -- Jonathan Swift, \"A Modest Proposal\"\n" +
            "\n" +
            "========================================================================\n" +
            "\n" +
            "        Over the past ten years, for the first time, intelligence had\n" +
            "become socially correct for girls.\n" +
            "        -- Tom Wolfe, \"Bonfire of the Vanities\"\n" +
            "\n" +
            " =======================================================================\n" +
            "\n" +
            "        He, in a few minutes ravished this fair creature, or at least would have\n" +
            "ravished her, if she had not, by a timely compliance, prevented him.\n" +
            "        -- Henry Fielding, \"Jonathan Wild\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "In the topsy-turvy world of heavy rock, it's often useful to have a nice,\n" +
            "solid piece of wood in your hands.\n" +
            "        -- Ian Faith, manager of Spinal Tap\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "All obvious theorems are true.\n" +
            "        -- Pommersheim's Principle\n" +
            "\n" +
            "All true theorems are obvious.\n" +
            "        -- Keane's Kriterion\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "        Ya gotta feel sorry for all them convicts in New Hampshire, stampin'\n" +
            "out license plates that say \"Live free or Die.\"\n" +
            "        -- ???\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "I'm a clown.  That's my sole mechanism of defense.  Very few people will go\n" +
            "out of their way to punish a clown.\n" +
            "        -- ???\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "        He who asks is a fool for five minutes, but he who does not ask remains\n" +
            "a fool forever.\n" +
            "        -- Old Chinese saying\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  Monty Python\n" +
            "\n" +
            "\"In accordance with our principles of free enterprise and\n" +
            "healthy competition, I'm going to ask you two to fight to\n" +
            "the death for it.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  Ripping Yarns\n" +
            "\n" +
            "\"Mind you, not as bad as the night Archie Pettigrew ate some\n" +
            "sheep's testicles for a bet...God, that bloody sheep kicked him...\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "        \"It's a hundred and six miles to Chicago, we've got a full tank of\n" +
            "gas, half a pack of cigarettes, it's dark, and we're wearing sunglasses.\"\n" +
            "        \"Hit it.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  Pink Panther\n" +
            "\n" +
            "\"Kato, what is going on in that little yellow brain of yours?\"\n" +
            "\n" +
            "        -- Chief Inspector Clouseau, in reference to a priceless white\\\n" +
            "           Steinway piano.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  Dave Barry\n" +
            "\n" +
            "Your digestive system is your body's Fun House, whereby food goes\n" +
            "on a long, dark, scary ride, taking all kinds of unexpected twists\n" +
            "and turns, being attacked by vicious secretions along the way, and\n" +
            "not knowing until the last minute whether it will be turned into a\n" +
            "useful body part or ejected into the Dark Hole by Mister Sphincter.\n" +
            "We Americans live in a nation where the medical-care system is\n" +
            "second to none in the world, unless you count maybe 25 or 30 little\n" +
            "scuzzball countries like Scotland that we could vaporize in seconds\n" +
            "if we felt like it.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  The Odd Couple\n" +
            "\n" +
            "\"A penny for your thoughts?\"\n" +
            "\"A dollar for your death.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  The Princess Bride\n" +
            "\n" +
            "\"Inconceivable!\"\n" +
            "\"You use that word a lot.  I do not think it means what you think it does.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  Daffy Duck\n" +
            "\n" +
            "\"Ho!  Ha-ha!  Guard!  Turn!  Parry!  Dodge!  Spin!  Ha!  Thrust!\"\n" +
            "        --D. Duck\n" +
            "\n" +
            "\"Consequences, shmonsequences!  So long as I'm rich!\"\n" +
            "        -- Daffy Duck\n" +
            "\n" +
            "\"Mine!  Mine!  It's all mine!\"\n" +
            "        -- D. Duck\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "  Politicians\n" +
            "\n" +
            "\"The genius of you Americans is that you never make clear-cut stupid moves,\n" +
            "only complicated stupid moves which make us wonder at the possibility that\n" +
            "there may be something to them we are missing.\"\n" +
            "        -- Gamel Abdel Nasser\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"Life's a bitch, and life's got lots of sisters.\"\n" +
            "        -- Ross Presser\n" +
            "\n" +
            " ========================================================================\n" +
            "\n" +
            "   All men dream: but not equally.  Those who dream by night in\n" +
            "   the  dusty  recesses  of their minds wake in the day to find\n" +
            "   that it  was  vanity:  but  the  dreamers  of  the  day  are\n" +
            "   dangerous  men, for they may act their dream with open eyes,\n" +
            "   to make it possible.\n" +
            "                                      T. E. Lawrence\n" +
            "                                      _The Seven Pillars of Wisdom_\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "   Always do what you are afraid to do.\n" +
            "\n" +
            "                                      Emerson\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "      \"It's said that 'power corrupts', but actually it's  more\n" +
            "      true  that  power attracts the corruptible.  The sane are\n" +
            "      usually attracted by other things than power.  When  they\n" +
            "      do  act,  they  think of it as service, which has limits.\n" +
            "      The tyrant, though, seeks mastery, for which he is  insa-\n" +
            "      tiable, implacable.\"\n" +
            "\n" +
            "                                    David Brin\n" +
            "                                    _The Postman_\n" +
            "\n" +
            " ========================================================================\n" +
            "\n" +
            "H. L. Mencken:     \"The American public knows what it wants,\n" +
            "                    and deserves to get it good and hard.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"Hankerin' for trouble, eh? Well I would like--\"\n" +
            "[aside] \"I would like? I would like a trip to Europe!\"\n" +
            "\"--I would like...\"\n" +
            "\n" +
            "                                --Daffy Duck, \"Dripalong Daffy\"\n" +
            "\n" +
            "\"Go on! Shoot me again! I enjoy it! I love the smell of burnt feathers\n" +
            " and gunpowder and cordite!\"\n" +
            "                                --Daffy Duck, \"Duck! Rabbit! Duck!\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"Well, Art is Art, isn't it? Still, on the other hand, water is water! And\n" +
            " East is East and West is West and if you take cranberries and stew them\n" +
            " like applesauce they taste much more like prunes than rhubarb does.\n" +
            " Now, uh... Now you tell me what you know.\"\n" +
            "                                --Groucho Marx, \"Animal Crackers\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"Go! And never darken my towels again!\"\n" +
            "                                --Groucho Marx, \"Duck Soup\".\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"Oh, I know it's a penny here and a penny there, but look at me. I worked\n" +
            "myself up from nothing to a state of extreme poverty.\"\n" +
            "                                --Groucho Marx, \"Monkey Business\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"The shortest distance between two points is through Hell.\"\n" +
            "            --Brian Clark\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "There are three side effects of acid.  Enchanced long term memory,\n" +
            "decreased short term memory, and I forget the third.\n" +
            "                        -Timothy Leary\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"I'm a great housekeeper.  I get devorced.  I keep the house\".\n" +
            "   --  Zsa Zsa Gabor\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"The will to win is worthless if you don't get paid for it\" (Reggie Jackson)\n" +
            "I have some better ones that I'll send you once I get them.\n" +
            "                                   Paul Wilbert\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"The knack of flying is learning how to throw yourself\n" +
            "at the ground and miss.\"\n" +
            "                                                         - Hitchhiker's\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " James Bond: What do you expect me to talk?\n" +
            " A.Goldfinger: No Mr. Bond, I expect you to die!\n" +
            "\n" +
            "                          Goldfinger\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            ">From a high school history teachers stash of student goodies:\n" +
            "                    (all spellings SIC)\n" +
            "\n" +
            "  \" The nineteenth century was a time of many great inventions and\n" +
            "thoughts. The invention of the steamboat caused a network of\n" +
            "rivers to spring up. Cyrus McCormic invented the McCormic raper\n" +
            "which could do the work of 100 men. Louis Pasteur discovered a cure\n" +
            "for rabbis. Charles Darwin was a naturalist who wrote the Organ\n" +
            "of Species. Madman Curie discovered radium. And Karl Marx became one\n" +
            "of the Marx brothers.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "On the old \"You Bet Your Life\" program, Groucho Marx was getting to know\n" +
            "one of his contestants.  The man told Groucho that he had 10 children.\n" +
            "\"Why so many children?\" Groucho asked.  \"Well, I love my wife\", the man\n" +
            "answered.  Groucho paused but a second, then said \"I love my cigar but\n" +
            "I take it out of my mouth once in a while!\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"Well, now, hold onta yer horses, there, Frazier.  I mean, as a psychiatrist,\n" +
            "isn't it your job to, uh, `seek and uphold the truth'?\"\n" +
            "\"Oh, get real, Cliff.\"\n" +
            "   --- Cheers\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "A witty saying proves nothing.\n" +
            "   --- Voltaire\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\"J. D. Salinger... John Knowles... even James Kirkwood and that\n" +
            "guy Don Bredes... they've destroyed being an adolescent,Garraty.\n" +
            "If you're a sixteen-year-old boy, you can't discuss the pains of\n" +
            "adolescent love with any decency anymore.  You just come off\n" +
            "sounding like fucking Ron Howard with a hardon.\"\n" +
            "                                    Richard Bachman (Stephen King)\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "\n" +
            " Anybody can win, unless there happens to be a second entry.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " Lunatic Asylum: The place where optimism most flourishes.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " Old soldiers never die.  Young ones do.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " The older a man gets, the farther he had to walk to school as a boy.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " Hartley's First Law:\n" +
            "         You can lead a horse to water, but if you can get him to float\n" +
            "         on his back, you've got something.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " Cole's Law:\n" +
            "         Thinly sliced cabbage.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " A conservative is one who is too cowardly to fight and too fat to run.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " Show respect for age.  Drink good Scotch for a change.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " Frisbeetarianism: The belief that when you die, your soul goes up the\n" +
            " on roof and gets stuck.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " The probability of someone watching you is proportional to the\n" +
            " stupidity of your action.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            " Bacchus: A convenient deity invented by the ancients as an excuse for\n" +
            " getting drunk.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "Winston Churchill: \"I like pigs. Dogs look up to us. Cats\n" +
            "look down on us. Pigs treat us as equals.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "Harry Bender:\n" +
            "              \"Imagine the appeals,\n" +
            "             Dissents and remandments,\n" +
            "              If lawyers had written\n" +
            "               The Ten Commandments\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "James Thurber: \"I think that maybe if women and children\n" +
            "were in charge we would get somewhere.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "Johnny Hart's comic strip \"B.C.\": \"If man evolved from the\n" +
            "ape, how come there are still apes around? Some of them were\n" +
            "given choices.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "Bill Watterson, cartoonist: \"Sometimes I think the surest\n" +
            "sign that intelligent life exists elsewhere in the universe\n" +
            "is that none of it has tried to contact us.\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "Unidentified Scientist:  \"After two years of trying,\n" +
            "scientists at the Yerkes Regional Primate Center have\n" +
            "managed to get a chimpanzee pregnant.\"  Which proves that no\n" +
            "task is repugnant to a true scientist.\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "Irv Kupcinet: \"What can you say about a society that says\n" +
            "God is dead and Elvis is alive?\"\n" +
            "\n" +
            "=========================================================================\n" +
            "\n" +
            "A countryman between two lawyers is like a fish between two cats.\n" +
            "                -- Ben Franklin\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "A Los Angeles judge ruled that \"a citizen may snore with immunity in his own\n" +
            "home, even though he may be in possession of unusual and exceptional ability in\n" +
            "that particular field.\"\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "A man said to the Universe: \"Sir, I exist!\"\n" +
            "\"However,\" replied the Universe,\n" +
            "\"the fact has not created in me a sense of obligation.\"\n" +
            "                -- Stephen Crane\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "Be self-reliant and your success is assured.\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "For economists, the real world is often a special case.\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "Ask five economists and you'll get five different explanations (six if\n" +
            "one went to Harvard).\n" +
            "                -- Edgar R. Fiedler\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "A meeting is an event where minutes are taken and hours wasted\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "An ounce of vanity can ruin a ton of merit.\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "You know the type.  They like to blame it all on the Jews or the Blacks,\n" +
            "'cause if they couldn't, they'd have to wake up to the fact that life's one\n" +
            "big, scary, glorious, complex and ultimately unfathomable crapshoot -- and the\n" +
            "only reason THEY can't seem to keep up is they're a bunch of misfits and losers\n" +
            "                -- A analysis of Neo-Nazis, from \"The Badger\" comic\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "Anyone who goes to a psychiatrist ought to have his head examined.\n" +
            "                -- Samuel Goldwyn\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "A person is just about as big as the things that make them angry.\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "The world's a stage and most of us are desperately unrehearsed.\n" +
            "                -- Sean O'Casey\n" +
            "\n" +
            "===============================================================================\n" +
            "\n" +
            "A year spent in artificial intelligence is enough to make one believe in God.\n" +
            "\n" +
            "===============================================================================";

    static {
        StringTokenizer tokenizer = new StringTokenizer(jokes,
                "===============================================================================");
        while (tokenizer.hasMoreElements()) {
            String joke = (String) tokenizer.nextElement();
            jokeLibrary.add(joke.trim());
        }

    }

    private Random random = new Random();

    public static final JokeTeller getInstance() {
        return instance;
    }

    public String tellJoke() {
        int n = random.nextInt(jokeLibrary.size());
        return jokeLibrary.get(n);
    }

}
