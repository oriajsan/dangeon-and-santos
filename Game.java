import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import ij.IJ;
import ij.ImagePlus;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!

 *  To play this game, create an instance of this class and call the "play"
 *  method.

 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Game 
{
    private final Parser parser;
    private Room currentRoom;
    public personagem player;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        currentRoom = new Room("Testando...", null, 0, null, false);

        parser = new Parser();
        createPersona();
        createRooms();
    }

    private void createPersona(){
        String name = parser.setName();
        showChoose();
        String clas = parser.setClass();
        player = new personagem(name, clas, currentRoom);
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room apresentacao, corredor, AnaFurtado, ValMarquiori, PatriciaAbravanel, InesBrasil, ReginaDuarte , CassiaKiss, SoniaAbrao, EdirMacedo, SilvioSantos, usurpadora;

        String nome = player.nome;
        String classe = player.classe;

        apresentacao = new Room(" 'Só há um caminho a ser seguido: Ir em frente, mesmo que o cenário não seja dos melhores e que essa seja minha primeira missão depois do meu longo treinamento com minha mestre Gloria Maria. Eu lhe deixarei orgulhosa veia!' \n", null, 0, null, false);

        corredor = new Room("Logo a frente 3 caminhos distintos surgiam, caminhos escuros e sinuosos que emergiam das profundezas da caverna. Do caminho da direita um som metalico e estridente ecoava, mas uma luz branca e amigavel despertava a curiosidade. O caminho da esquerda era o mais escuro de todos de lá nada se ouvia, mas um cheiro repulsivo de egocentrismo invadia suas narinas. O caminho a frente era iluminado por tochas azuladas, era o caminho mais favoravel. \n", null, 0, null, false);

        AnaFurtado = new Room("A medida em que se aproximava da origem do som metalico um calor infernal tomava conta do ambiente, nuvens de vapor obstruiam a visão tornando o caminho dificil e perigoso. Uma risada alta e irritante ecoou pelo tunel, a visão do sorriso vilanesco e forçado se formava na cabeça e isso só podia indicar uma coisa: A soberba Ana Furtado estava por perto... O fim do tunel terminava em um grande buraco no chão de onde subia a fumaca e o vapor quente, olhar para baixo era como vislumbrar o fundo de um abismo, uma queda que poderia facilmente acabar com sua vida, mas seu senso de justica e moral era mais forte, um salto para cumprir sua missao, um salto de fé. \n \n -- O osculo da Repetição -- \n \n", null, 0, null, false);


        CassiaKiss = new Room("Quanto mais se aprofundava pela escuridão daquela rede de tuneis contando apenas com seus sentidos apurados pelos anos de treinamento arduo, desistir agora não era e nunca foi uma opção, o sonho de ser reconhecido como o maior" + classe + "de todo o reinado permanecia intacto e cada vez mais proximo de se realizar, entao nada e ninguem podiam abalar " + nome + ". POrem a medida que explorava nao deixava de pensar que cada vez mais coisas inimaginaveis e arcaicas ainda existiam em nosso mundo, escondidos ali nas cavernas e se fortalecendo cada vez mais atraves de toda a ignorancia e conservadorismo, nutrindo o odio or tudo que vão contra suas diretrizes e dogmas extremistas. Se aventurar por ali não seria facil ainda mais quando não se sabe qual o proximo vilão que se encontrara na proxima curva, escondido nas sombras ou ate preste a atacar ao menor sinal de movitação que contradiga seus preconceitos. E entao logo a frente surge entre as paredes rochosas um pequeno caminho, um caminho de pouco mais de 1 metro de largura, de la de dentro se ouvia um som roco e fraco: 'A profecia vai se realizar, sangue sera derramado e jorrará por todo o reino, assim diz o senhor'. Se contorcendo para passar pela pequena abertura, la dentro uma chama vermelha iluminava o ambiente pequeno e apertado sem espaço para mais nada que pudesse agregar em algo, no canto da sala uma idosa esquia e caquetica encarava com devoção um imagem distorcida cravada na parede ao notar sua presença a velha virou completamente a cabeça em 180 graus, levantou de forma distorcida fazendo todos os seus ossos estralarem como se estivessem sendo partidos ao meio, ela lhe encarou, o odio que ela sentia pela pertubação era visivel em seus olhos, aquela nao seria uma criatura facil de lutar... \n \n -- A Fanatica -- \n \n", null, 0, null, false);

        InesBrasil = new Room(" Um rastro na terra solta da caverna levava a entrada de uma pequena caverna econdida entre duas grandes estalactites, parecia que alguem havia se arrastado ate ali, provavelmente estava com ferimentos serios. Com esforço e se espremendo para passar pela apertada passagem, e vê que uma pequena tocha ja quase se apagando esta acessa no meio do chão, você se aproxima com cuidado, não se sabe se aquilo seria uma armadilha ou não, mas antes que pudesse chegar mais perto você sente alguem lhe agarrar por trás e gritando alto: \n -'O grito da panterona UAAAAAAAARW'. A força exercida fez ambos cairem no chão, provocando um som alto e deixando nosso heroi todo dolorido.\n -'Seja a pessoa que for, se me atacar eu vou atacar' - brandiu a mulher ainda o prendendo com força. \n -'Ei, ei calma eu não vou te atacar!!! Só saia de cima por favor ta dificil de respirar...' \n -'Não, não mon amour, primeiro me fala quem é você é mai um dos patifes que levaram a Rainha Xuxa?' \n -'Não!! Pelo contrario eu vim foi resgatá-la, fui contratado pelo povo do vilarejo para levar ela de volta. Eu juro! Agora, por favor, me deixa respirar!' \n -'Graça a deus! Eu segui essa corja nojenta ate aqui so acabei me machucando na entrada da caverna e pra nao ser encontrada me escondi aqui esperando o momento certo pra agir, ate porque é aquele ditado: Aqui se faz, aqui se paga. Vamo entregar tudo na mão de Deus.' \n -'Graças a Deus...' \n -'Graças a Deus!' \n -'Graças a Deus.' \n -'Então mon amour, deixa eu ver... Nossa você tá bem fraquinho, tem certeza que vai dar conta de salvar nossa rainha ?' \n -'Eu sou um grande'" + classe + " 'é claro que vou conseguir.' \n -'Graças a Deus! porque é aquele ditado : Se esse mundo existe, graças a Deus, por que existe? Porque graças a Deus nós fizemos o mundo, graças a Deus. Não, desculpe falar. Se existe nós nesse mundo, graças a Deus, é porque Deus fez o mundo. Mas eu falei uma palavra certa: se nós não existi... mos... se não existíamos nós, que que ia acontecer? Não teria também ninguém pra falar de Deus, só ele mesmo, e falar do mundo que existe de nós mesmos. Graças a Deus!' \n -'Graças a Deus??!' \n -'Qual é teu nome mesmo?... Quer saber não importa. Aqui pega isso, é uma poção de cura, eu tava guardando para dar para minha rainha, mas vejo que você vai precisar mais Graças a Deus.' \n -'Vou guardá-la com todas a minhas forças e a entregarei unicamente para vossa rainha, é minha palavra de honra.' - o nobre heroi disse se ajoelhando perante a mulher de seios avantajados e religiosa. \n -'Agora vá, nossa rainha corre perigo e cada segundo perdido é muito precioso, mas lembre-se: 'Todo mundo é gente mas ninguém é igual, mas temos o coração limpo então 'samos' tudo normal.'' \n Com lagrimas saindo dos olhos, nosso heroi saiu da caverna, nunca alguem tão sabio havia cruzado seu caminho, aquelas palavras de ensinamento o acompanharia durante toda sua jornada, ele se sentia revigorado e pronto para enfrentar qualquer desafio que viria pela frente. \n \n -- A Sabia Panterona -- \n ", null, 0, null, false);


        PatriciaAbravanel = new Room("A sensação das tochas azuis gerava um conforto, uma sutileza de paz, mas a medida em que caminhava por aquele espaço via-se que aquele lugar so podia abrigar uma coisa, a falsa modestia e empatia, por isso as chamas azuis uma forma de enganar os desavisados. O caminho cuminou em uma pequena caverna, em um dos cantos um altar envolto de velas chamou a atenção, resistir a tentação de e aproximar e verificar o que se tratava não etava em cosideração um vez que a vida da Rainha de Televions estava em jogo. A medida em que se aproximava o fria na barriga aumentava, ver um suposto sacrificio não é algo facil de lidar. Quando se aproximou do altar de pedras um livro aberto com letras desconhecidas em um vermelho vivo se destacava, apenas uma frase eram visiveis e facil de entender: ' As pessoas também tem que respeitar o preconceito.' você leu em voz alta, e entao todo o ambiente mergulhou na escuridão e emtão  entre as sombras surge a abominavel Patricia Abravanel, mestre do vitimismo e preconceito. \n \n -- Caverna do Sequestro -- \n\n", null, 0, null, false);


        ReginaDuarte = new Room(" 'O sentimento de derrota e de fracasso aumentava a cada passo, se sacrificar tanto assim, arriscar a vida por uma simples mulher? Não entendo, porque continuo aqui fazendo isso eu poderia voltar, abandonar tudo isso, ja perdi tanta coisa ao longo dessa jornada, parece que tudo o que eu acredito esta se perdendo cada vez que encontro algum er das trevas, parece que ja não sou mais eu... Será que esse meu destino? Perder todas as minhas convicções e ensinamentos por uma missão??'. \n O caminho agora já nao parecia mais o mesmo de antes é como se um novo andar surgisse do nada. Agora um corredor encrustado nas pedras levava ate as profundezas da caverna, um local que ninguem antes tinha ido. A medida que caminhava pelo corredor deserto se ouvia ao longe gritos agudos, tirados do fundo do peito em uma sessão de tortura, aquele grito de desepero e de perda de esperança, a partir dali naada mais importava. A cada passo o medo invadia seu corpo, de onde estaria vindo aquele grito, que tipo de atrocidade estava endo feita e por quem ? perguntas que seriam respondidas logo, ja que agora prostado a sua frente uma porta metalica enferrujada se abria lentamente revelando um ambiente de tortura que nem os mais preparados podiam escapar. Uma mão ossuda e pontuda agarrou a borda da porta e a medida que a porta ia se abrindo a figura se mostrva cada vez mais, a chefe da desinformação, responsavel pela queda de um reino inteiro por causa de uma fake news, a temida Regina Duarte. \n \n -- Dama Fake --  \n\n", null, 0, null, false);


        ValMarquiori = new Room("A cada passo o cheiro insuportavel ficava mais forte, o caminho era incrivelmente apertado como se qualquer bom senso, inteligencia, empatia e respeito jamais conseguisse passar. A cada passo se tinha a certeza que nada de bom sairia dali, apenas ignorancia, egocentrismo e incoveniencia sobreviviam ali. Se contorcendo para passar naqueles pequenos espaços ate que ao longe escondida entre as pedras surge a criatura Val Marquire a bruxa do egoncentro.  \n \n -- O Beco da Ignorancia -- \n\n  ", null, 0, null, false);


        SoniaAbrao = new Room(" 'Dizem que coragem não é a ausencia do medo, mas a vontade lutar contra ele. Nisso tenho que concordar, mas e quando você nao esta sentindo mais nada? Diante de tudo que tive que passar ate agora posso considerar que uma parta de mim foi morrendo aos pouco tive que ver e encarar coisas que eu não queria encontrar nem em meus piores pesadelos. Isso tudo por causa de uma missao?? Sera que assim serei um " + classe + " ' honrado? Se eu concluir essa primeira missão terei a chance de me considerar digno de viver?'. O percusso não tinha sido nada facil para nosso heroi, e agora toda a exaustão do corpo e da mente lhe feria ainda mais, é impossivel lutar contra tanto seres repugnante e continuar da mesma forma. Mesmo estando a horas vagando por toda a rede de tuneis " + nome + " não encontrava nenhum rastro da Rainha Xuxa, sua esperança de a encontrar ainda com vida diminuia a cada passo dado em meio aquele ambiente toxico. Perambulando em meio as rochas e pedras afiadas, tomando cuidado para nao se cortar, ate sentir algo molhado sobre os pés, de alguma forma todo o chao estava coberto por uma substancia escura e fedida que grudava seus pés a cada passo, devido a dificuldade em se locomover, nosso heroi não notou o ser rastejante preso ao teto que o observava de cima e se movia junto dele a cada passo, porem uma estranha sensação percorria seu corpo como se algo muito perigoso estivesse prestes a acontecer... E sua sensação se confirmou quando logo a frente um som de algo caindo sobre o liquido escuro. A criatura estava encurvada, mas aos poucos ia ser erguendo a cada movimento um som de ossos estralando ecoava alto pela caverna, quando o ser ja estva completamete em pé dava para se enxergar sua verdadeira forma: Uma mulher comum, de feições comum e que a primeira vista não demonstrava nenhum perigo, mas aquela estranha sensação de perigo o mantinha alerta, como uma vez dissera sua mestra Gloria Maria: 'É sobre as feições mais doces e inocentes que mora o veradeiro perigo, porque nunca se sabe do que a pessoa é capaz'. A mulher estralou os dedos, e então todo o ambiente se encheu de uma carga pesada como e toda a dor do mundo estivesse se concentrado naquele unico lugar, a sensação de julgamento e preconceito era palpavel no ar, e junto disso a mulher começou a se contorcer, e em segundos sua feição ja não era mais a mesma, sua boca se abriu ainda mais rasgando o rosto ate a altura das orelhas, os olhos ganharam uma cor preta sombria, porem a postura ereta e o ar de superioridade continuavam o mesmo, aquela não seria uma simples criatura igual as anteriores, e foi nesse momento que " + nome + "nao sentiu medo. \n \n -- A Supremacia Tardia -- \n\n", null, 0, null, false);


        EdirMacedo = new Room("O caminho a frente agora era repleto de simbolo estranhos cravados nas paredes, eles se estendiam do chão ao teto, era uma especie de triangulo com uma cruz o dividindo, isso não era um bom pressagio, esse simbolo a muito tempo fora esquecido oriundo de uma epoca em que a profanação e a idolatria se espalhava como folhas ao vento, os Adoradores do Tatilano, era como se chamavam, tudo começou como um culto pacifico que aos poucos foi e tornando cada vez mais radical e extremista, onde seus eguidores tentavama todo custo impor seu modo de pensar em agir sobre todo o reino, formando uma utopia só deles regrada a violencia contra os diferentes deles, preconceito e odio. Uma guerra foi iniciada contra eles que cada vez ganhavam mais poder, eu achei que todo os seguidores tinham sido mortos ou presos pela eternidade, mas parece que um conseguiu se manter escondido e a idolatria so aumentou com o passar do tempo. Caminhar por aquele local trazia os fantasmas das vitimas desssa seita de volta, seus gritos de agonia ecoavam pela mente, era aterrorizante saber que tantas pessoas morreram em foram torturadas por crenças interpretadas erroneamente, e em quanto um unico adepto desse culto permanecer impune as vitimas não terão sua paz, entao mesmo se minhas pernas falharem e o medo tomar conta da minha espinha, eu tenho que fazer isso, não por mim, mas por todos aqueles que não estão mais aqui. Seguro firme minha arma e corro em direção a escuridão que me aguarda. \n \n -- O Pastor -- \n\n ", null, 0, null, false);

        SilvioSantos = new Room("'Jamais esperaria que conseguiria derrotar a demida e perversa Sônia Abrão. Mas como tudo na vida aquela batalha me custou um preço alto, perder um olho com certeza dificultara o resto da minha jornada, eu poderia usar a poção de cura da poderosa Panterona, mas ela é designada a rainha, eu não me atrevo a bebe-la, tenho que prosseguir mesmo diate de todas as adversidades, isso que é o significado de uma heroi, isso que o significado da palavra heroi. Sei que não posso me considerar um, ainda tenho muito caminho a trilhar ao longo da minha vida, não sou digno de ser chamado de heroi, não sou como minha mestre'", null, 0 , null, false);


        // saida apresentação do jogo.
        apresentacao.setExits("north", corredor);

        // saidas do corredor
        corredor.setExits("north", PatriciaAbravanel);
        corredor.setExits("west", AnaFurtado);
        corredor.setExits("east", ValMarquiori);

        // saidas da caverna Furtado
        AnaFurtado.setExits("north", CassiaKiss);
        AnaFurtado.setExits("west", InesBrasil);
        AnaFurtado.setExits("east", corredor);

        // saidas Kiss
        CassiaKiss.setExits("south", AnaFurtado);

        // saidas Ines
        InesBrasil.setExits("east", corredor);

        // saidas patricia
        PatriciaAbravanel.setExits("south", corredor);

        // saidas regina
        ReginaDuarte.setExits("south", ValMarquiori);

        // saidas val
        ValMarquiori.setExits("north", ReginaDuarte);
        ValMarquiori.setExits("east", EdirMacedo);
        ValMarquiori.setExits("west", SoniaAbrao);

        //saidas Edir
        EdirMacedo.setExits("west", ValMarquiori);

        //saidas Sonia
        SoniaAbrao.setExits("east", ValMarquiori);
       // SoniaAbrao.setExits("north", SilvioSantos);

        currentRoom = apresentacao;
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() throws IOException, InterruptedException {

        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() throws InterruptedException {
        String typePersona = player.classe;
        String nickName = player.nome;
        System.out.println();

        System.out.println("Welcome to the World of Zuul!");
        Thread.sleep(3000);

        System.out.println("Há muito, muito tempo, quando o mundo ainda enxergava apenas em preto e branco, uma pequena vila de nome TeleVisions foi fundada sobre a nobre sabedoria da amavel e gentil rainha Xuxa Meneguel, ao lado de sua conselheira Hebe Camargo e o seu fiel e amado amigo, o xerife Paulo Gustavo. Mas bem longe dali, nas temidas florestas Lenevarba um mal se erguia e aos poucos conquistava mais poder oriudos da magias da trevas da ignorancia e conservadorismo, liderados pelo tiranos Silvio Santos e Sonia Abraão, o exercito partiu em direção a TeleVisions devastando tudo ao seu redor. O grupo invadiu a pequena vila saqueando tudo ao seu redor, o xerife Paulo Gustavo lutou com toda sua bravura e honra tendo sua fiel escudeira Erminia ao seu lado, porém não foi o bastante para derrotar as forças do mal e seu destino foi ir de base e se juntar ao pai Jô Soares. A rainha Xuxa lutou com todas sua forças, mas seus poderes vindo de seus discos ao contrario não foi o bastante, a energia dos baixinhos não foi o suficiente contra a trupe de Santo e Abraão que a capturaram e entregaram para ser torturada nas mãos de Regina Duarte, nas profundezas das cavernas Sotnas, um lugar de trevas e desespero.\n \n Desesperados para ter sua rainha de volta, o povo de TeleVisions juntou tudo o que lhes restou e contrataram a/o famosa/o " + typePersona + " " + nickName + " para trazer sua rainha de volta a qualquer custo...");
        Thread.sleep(5000);

        System.out.println();
        System.out.println();
        System.out.println("Sua jornada pelas cavernas Sotnas para recuperar a Rainha Xuxa Meneguel de volta comeca agora!");
        Thread.sleep(5000);
        System.out.println("\n");

        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("Eu não entendi o que você quis dizer, repete please...");
            return false;
        }
        if(player.vida<= 0){
            System.out.println("Voce morreu :/");
            return true;
        }
        String commandWord = command.getCommandWord();
        switch (commandWord) {
            case "help" -> printHelp();
            case "map" -> showMap();
            case "go" -> goRoom(command);
            case "ataque" -> cast(command);
            case "quit" -> wantToQuit = quit(command);
            case "scout" -> this.scout();
            case "info" -> {
                System.out.println("Nome: " + player.nome);
                System.out.println("Level: " + player.level);
                System.out.println("Classe: " + player.classe);
                System.out.println("Saude: " + player.vida);
            }
            case "loot" -> {
                ArrayList<item> lut;
                lut = currentRoom.espolios;
                if (lut == null) {
                    System.out.println("Nao ha nada de valor aqui...");
                } else {
                    ArrayList<item> lootpool = currentRoom.espolios;
                    while (lootpool.size() >= 1) {
                        player.getItem(lootpool.get(0));
                        lootpool.remove(0);
                    }
                    System.out.println(lootpool);
                }
            }
            case "inventario" -> player.olhainventario();
        }
        return wantToQuit;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("Parece que você esta perdido...");
        System.out.println("Quem diria que uma rede de cavernas seria tão dificil de andar?!");
        System.out.println("Suas opções são: ");
        parser.showCommands();
    }

    /** 
     * Try to in to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command)
    {
        String fixa = "Logo a frente 3 caminhos distintos surgiam, caminhos escuros e sinuosos que emergiam das profundezas da caverna. Do caminho da direita um som metalico e estridente ecoava, mas uma luz branca e amigavel despertava a curiosidade. O caminho da esquerda era o mais escuro de todos de lá nada se ouvia, mas um cheiro repulsivo de egocentrismo invadia suas narinas. O caminho a frente era iluminado por tochas azuladas, era o caminho mais favoravel.";

        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("Sem saída.");
        }
        else {

            currentRoom = nextRoom;
            if (Objects.equals(nextRoom.getLongDescription(), fixa)){
                System.out.println(currentRoom.getLongDescription());
            }
            else {
                System.out.println(currentRoom.getLongDescription());
                currentRoom.mudarDescricao();
            }

        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

    private void scout(){
        if(currentRoom.inimigos != null){
            System.out.println(currentRoom.getInis());
        }else{
            System.out.println("Parece que não tem inimigos aqui");
        }
    }

    public void miss(){
        System.out.println("Nao acertou nada");
    }

    public void dmgPlayer(int dmg){
        player.vida = player.vida - dmg;
        System.out.println("Voce Sofreu "+ dmg +" de dano");
        if(player.vida<= 0){
            System.out.println("Voce morreu :/");
            Command bye = new Command("quit", null);
            quit(bye);
        }
    }

    /**
     * Try to go in one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void cast(Command command){
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Qual habilidade você quer usar?");
            return;
        }
        String skill = command.getSecondWord();
        System.out.println(skill);
        if (Objects.equals(skill, "Corte")){
            int dano = 50;
            System.out.println("Digite o indicie do alvo desejado");
            System.out.println();
            this.scout();
            personagem alvo;
            int index = parser.setAlvo();
            if(index<= currentRoom.inimigos.size()){
                alvo = currentRoom.inimigos.get(index);
                dmgPlayer(alvo.level*10);
                alvo.vida = alvo.vida - dano;
                String nome = alvo.nome;
                System.out.println(nome + " Sofreu "+ dano+" de dano!");
                if (alvo.vida <=0){
                    System.out.println(nome+" morreu!");
                    int xp = alvo.level;
                    player.level = player.level + xp;
                    System.out.println("Voce ganhou " + xp + " Levels");
                    currentRoom.inimigos.remove(alvo);
                }
            }else{
                miss();
            }

        }else{
            System.out.println("nao entendi");
        }
    }

    private static void showMap() {
        ImagePlus imagePlus = IJ.openImage("POO/Capitulo8/zuul-better/images/mapa.png");
        imagePlus.show();
    }

    private static void showChoose() {
        ImagePlus imagePlus = IJ.openImage("POO/Capitulo8/zuul-better/images/personagens.jpg");
        imagePlus.show();
    }
}
