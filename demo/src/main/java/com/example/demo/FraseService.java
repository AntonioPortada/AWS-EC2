package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FraseService {

    public FraseDTO getFrase() {
        return frases();
    }

    private FraseDTO frases() {
        List<String> frases = List.of(
            "La vida se trata de generar impacto, no de generar ingresos.|Kevin Kruse",
            "Cualquier cosa que la mente del hombre pueda concebir y creer, puede lograrlo.|Napoleon Hill",
            "EsfuÃ©rcese no por ser un Ã©xito, sino por ser valioso.|Albert Einstein",
            "Dos caminos divergieron en un bosque, y tomÃ© el menos transitado, y eso marcÃ³ toda la diferencia.|Robert Frost",
            "Atribuyo mi Ã©xito a esto: nunca di ni tomÃ© ninguna excusa.|Florence Nightingale",
            "Te pierdes el 100% de los tiros que no haces.|Wayne Gretzky",
            "He fallado mÃ¡s de 9000 tiros en mi carrera. He perdido casi 300 juegos. 26 veces me han confiado para tomar el tiro ganador y fallÃ©. He fallado una y otra y otra vez en mi vida. Y es por eso que tengo Ã©xito.|Michael Jordan",
            "Lo mÃ¡s difÃ­cil es la decisiÃ³n de actuar, el resto es meramente tenacidad.|Amelia Earhart",
            "Cada strike me acerca al prÃ³ximo jonrÃ³n.|Babe Ruth",
            "La definiciÃ³n de propÃ³sito es el punto de partida de todo logro. â€“W.|Clement Stone",
            "La vida no se trata de obtener y tener, se trata de dar y ser.|Kevin Kruse",
            "La vida es lo que te sucede mientras estÃ¡s ocupado haciendo otros planes.|John Lennon",
            "Nos convertimos en lo que pensamos|Earl RuiseÃ±or",
            "Dentro de veinte aÃ±os estarÃ¡s mÃ¡s decepcionado por las cosas que no hiciste que por las que hiciste, asÃ­ que tira las amarras, navega lejos del puerto seguro, atrapa los vientos alisios en tus velas. Explora, sueÃ±a, descubre.|Mark Twain",
            "La vida es un 10% de lo que me sucede y un 90% de cÃ³mo reacciono ante ello.|Charles Swindoll",
            "La forma mÃ¡s comÃºn en que las personas renuncian a su poder es pensando que no lo tienen.| Alice Walker",
            "La mente lo es todo. En lo que crees que te conviertes.|Buda",
            "El mejor momento para plantar un Ã¡rbol fue hace 20 aÃ±os. El segundo mejor momento es ahora.|Proverbio chino",
            "Una vida sin examinar no vale la pena vivirla.|SÃ³crates",
            "El ochenta por ciento del Ã©xito estÃ¡ en aparecer.|Woody Allen",
            "Tu tiempo es limitado, asÃ­ que no lo desperdicies viviendo la vida de otra persona.|Steve Jobs",
            "Ganar no lo es todo, pero querer ganar sÃ­ lo es.|Vince Lombardi",
            "No soy producto de mis circunstancias. Soy producto de mis decisiones.|Stephen Covey",
            "Todos los niÃ±os son artistas. El problema es cÃ³mo seguir siendo un artista una vez que crece.|Pablo Picasso",
            "Nunca puedes cruzar el ocÃ©ano hasta que tengas el coraje de perder de vista la orilla.|CristÃ³bal ColÃ³n",
            "He aprendido que la gente olvidarÃ¡ lo que dijiste, gente olvidarÃ¡ lo que hiciste, pero la gente nunca olvidarÃ¡ cÃ³mo los hiciste sentir.|Maya Angelou",
            "O diriges el dÃ­a, o el dÃ­a te dirige a ti.|Jim Rohn",
            "Tanto si crees que puedes como si crees que no puedes, tÃº' a la derecha.|Henry Ford",
            "Los dos dÃ­as mÃ¡s importantes de tu vida son el dÃ­a en que naces y el dÃ­a en que descubres por quÃ©.|Mark Twain",
            "Lo que sea que puedas hacer, o sueÃ±es que puedes hacer, comienza con ello. La audacia tiene genio, poder y magia en ella.|Johann Wolfgang von Goethe",
            "La mejor venganza es el Ã©xito masivo.|Frank Sinatra",
            "La gente suele decir que la motivaciÃ³n no dura. Bueno, baÃ±arse tampoco. Por eso lo recomendamos a diario.|Zig Ziglar",
            "La vida se contrae o se expande en proporciÃ³n al coraje de uno.|Anais Nin",
            "Si escuchas una voz dentro de ti que dice â€œno puedes pintarâ€, entonces por supuesto pinta y esa voz serÃ¡ silenciada.| Vincent Van Gogh",
            "SÃ³lo hay una manera de evitar la crÃ­tica: no hacer nada, no decir nada y no ser nada.|AristÃ³teles",
            "Pide y se te darÃ¡; Busca y lo encontrarÃ¡s; llama y la puerta se te abrirÃ¡.|JesÃºs",
            "La Ãºnica persona que estÃ¡s destinado a ser es la persona que decidas ser.|Ralph Waldo Emerson",
            "Ve con confianza en la direcciÃ³n de tus sueÃ±os. Vive la vida que has imaginado.|Henry David Thoreau",
            "Cuando me presente ante Dios al final de mi vida, espero que no me quede ni un poco de talento y pueda decir, usÃ© todo lo que me diste.|Erma Bombeck",
            "Pocas cosas pueden ayudar mÃ¡s a una persona que responsabilizarla y hacerle saber que usted confÃ­a en ella. â€“Booker T.|ashington",
            "Ciertas cosas te llaman la atenciÃ³n, pero persigue solo aquellas que capturan el corazÃ³n.|Proverbio indio antiguo",
            "Cree que puedes y estÃ¡s a mitad de camino.|Theodore Roosevelt",
            "Todo lo que siempre has querido estÃ¡ al otro lado de miedo.|George Addair",
            "FÃ¡cilmente podemos perdonar a un niÃ±o que tiene miedo a la oscuridad; la verdadera tragedia de la vida es cuando los hombres tienen miedo a la luz.|PlatÃ³n",
            "EnseÃ±a a tu lengua a decir: 'No sÃ©', y progresarÃ¡s.|MaimÃ³nides",
            "Empieza donde estÃ¡s. Usa lo que tienes. Haz lo que puedas.|Arthur Ashe",
            "Cuando tenÃ­a 5 aÃ±os, mi madre siempre me decÃ­a que la felicidad era la clave de la vida. Cuando fui a la escuela, me preguntaron quÃ© querÃ­a ser cuando fuera grande. EscribÃ­ 'feliz'. Me dijeron que no entendÃ­a la tarea, y les dije que no entendÃ­an la vida.|John Lennon",
            "Caer siete veces y levantarse ocho.|Proverbio japonÃ©s",
            "Cuando una puerta de la felicidad se cierra, otra se abre, pero muchas veces miramos tanto tiempo en la puerta cerrada que no vemos la que se ha abierto para nosotros.|Helen Keller",
            "Todo tiene belleza, pero no todos pueden ver.|Confucio",
            "QuÃ© maravilloso es que nadie necesite esperar un solo momento antes de comenzar a mejorar el mundo.|Ana Frank",
            "Cuando dejo ir lo que soy, me convierto en lo que podrÃ­a ser.|Lao Tzu",
            "La vida no se mide por el nÃºmero de respiraciones que tomamos, sino por los momentos que nos quitan el aliento.|Maya Angelou",
            "La felicidad no es algo prefabricado. Viene de tus propias acciones.|Dalai Lama",
            "Si te ofrecen un asiento en un cohete espacial, Â¡no preguntes quÃ© asiento! Siga adelante. Sheryl Sandberg Primero, tenga un ideal prÃ¡ctico definido y claro; una meta, un objetivo. Segundo, disponer de los medios necesarios para alcanzar sus fines; sabidurÃ­a, dinero, materiales y mÃ©todos. Tercero, ajusta todos tus medios a ese fin.|AristÃ³teles",
            "Si el viento no te sirve, toma los remos.|Proverbio latino",
            "No puedes caer si no escalas. Pero no hay alegrÃ­a en vivir toda tu vida en el suelo.|Desconocido",
            "Debemos creer que estamos dotados para algo, y que esto, a cualquier costo, debe ser alcanzado.|Marie Curie",
            "Demasiados de nosotros no estamos viviendo nuestros sueÃ±os porque estamos viviendo nuestros miedos.|Les Brown",
            "Los desafÃ­os son los que hacen que la vida sea interesante y superarlos es lo que hace que la vida tenga sentido.|Joshua J. Marine",
            "Si quieres levantarte a ti mismo, levanta a alguien mÃ¡s. â€“Booker T.|ashington",
            "Me ha impresionado la urgencia de hacer. Saber no es suficiente; debemos aplicar. Estar dispuesto no es suficiente; debemos hacer.|Leonardo da Vinci",
            "Las limitaciones viven sÃ³lo en nuestras mentes. Pero si usamos nuestra imaginaciÃ³n, nuestras posibilidades se vuelven ilimitadas.|Jamie Paolinetti",
            "Tomas tu vida en tus propias manos, Â¿y quÃ© sucede? Una cosa terrible, nadie a quien culpar.|Erica Jong",
            "Â¿QuÃ© es el dinero? Un hombre es un Ã©xito si se levanta por la maÃ±ana y se acuesta por la noche y en el medio hace lo que quiere hacer.|Bob Dylan",
            "No reprobÃ© la prueba. Acabo de encontrar 100 formas de hacerlo mal.|Benjamin Franklin",
            "Para tener Ã©xito, tu deseo de Ã©xito debe ser mayor que tu miedo al fracaso.|Bill Cosby",
            "Una persona que nunca cometiÃ³ un error nunca intentÃ³ nada nuevo.|Albert Einstein",
            "El persona que dice que no se puede hacer no debe interrumpir a la persona que lo estÃ¡ haciendo. conviÃ©rtete en lo que crees.|Oprah Winfrey",
            "PreferirÃ­a morir de pasiÃ³n que de aburrimiento.|Vincent van Gogh",
            "Un hombre verdaderamente rico es aquel cuyos hijos corren a sus brazos cuando sus manos estÃ¡n vacÃ­as.|Desconocido",
            "No es lo que haces por tu niÃ±os, sino lo que les has enseÃ±ado a hacer por sÃ­ mismos, eso los convertirÃ¡ en seres humanos exitosos.|Ann Landers",
            "Si quieres que tus hijos salgan bien, pasa el doble de tiempo con ellos y la mitad de dinero.|Abigail Van Buren",
            "Construye tus propios sueÃ±os, o alguien mÃ¡s te contratarÃ¡ para construir los suyos. Farrah Gray",
            "Las batallas que cuentan no son las de las medallas de oro. Las luchas dentro de ti, las batallas invisibles dentro de todos nosotros, ahÃ­ es donde estÃ¡.|Jesse Owens",
            "La educaciÃ³n cuesta dinero. Pero tambiÃ©n lo hace la ignorancia.|Sir Claus Moser",
            "He aprendido a lo largo de los aÃ±os que cuando uno estÃ¡ decidido, esto disminuye el miedo.|Rosa Parks",
            "No importa quÃ© tan lento vaya mientras no se detenga.|Confucio",
            "Si miras lo que tienes en la vida, siempre tendrÃ¡s mÃ¡s. Si miras lo que no tienes en la vida, nunca tendrÃ¡s suficiente.|Oprah Winfrey",
            "Recuerda que no obtener lo que quieres es a veces un maravilloso golpe de suerte.|Dalai Lama",
            "No puedes agotar la creatividad. Cuanto mÃ¡s usas, mÃ¡s tienes.|Maya Angelou",
            "SueÃ±a en grande y atrÃ©vete a fallar.|Norman Vaughan",
            "Nuestras vidas empiezan a terminar el dÃ­a que guardamos silencio sobre las cosas que importan.|Martin Luther King",
            "Haz lo que puedas, donde eres, con lo que tienes.|Teddy Roosevelt",
            "Si haces lo que siempre has hecho, obtendrÃ¡s lo que siempre has obtenido.|Tony Robbins",
            "SoÃ±ar, despuÃ©s de todo, es una forma de planificaciÃ³n.|Gloria Steinem",
            "Es tu lugar en el mundo; es tu vida. ContinÃºe y haga todo lo que pueda con Ã©l, y conviÃ©rtalo en la vida que desea vivir.|Mae Jemison",
            "Puede sentirse decepcionado si falla, pero estÃ¡ condenado si no lo intenta.|Beverly Sills",
            "Recuerde que nadie puede te sientes inferior sin tu consentimiento.|Eleanor Roosevelt",
            "La vida es lo que hacemos, siempre lo ha sido, siempre lo serÃ¡.|Abuela Moses",
            "La pregunta no es quiÃ©n me lo va a permitir; es quien me va a detener.|Ayn Rand",
            "Cuando todo parezca ir en tu contra, recuerda que el aviÃ³n despega contra el viento, no con Ã©l.|Henry Ford",
            "No son los aÃ±os de tu vida los que cuentan. Es la vida en tus aÃ±os.|Abraham Lincoln",
            "Cambia tus pensamientos y cambiarÃ¡s tu mundo.|Norman Vincent Peale Escribe algo que valga la pena leer o haz algo que valga la pena escribir.|Benjamin Franklin",
            "Nada es imposible, la palabra misma dice, â€œSoy posible!â€|Audrey Hepburn",
            "La Ãºnica manera de hacer un gran trabajo es amar lo que haces.|Steve Jobs",
            "Si puedes soÃ±arlo, puedes lograrlo.|Zig Ziglar"
        );
            
        int indice = (int)(Math.random() * frases.size());
        String[] frase = frases.get(indice).split("\\|");
        return new FraseDTO(frase[0], frase[1], 1);
    }

}