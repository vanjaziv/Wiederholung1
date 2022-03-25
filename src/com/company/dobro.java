package com.company;

public class dobro {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }
        }
    }
}
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recipes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>

<body>
    <header>
        <h1>Vanja's Recipes</h1>
    </header>
    <main>
        <article title="Pizza Hawaii">
          <h2>Pizza Hawaii</h2>
          <h3>Ingredients</h3>
          <ul>
              <li>1 Pineapple</li>
              <li>1/2 kg Flour</li>
              <li>1 Tomatoes</li>
          </ul>
          <h3>Steps</h3>
          <ol>
             <li>To make the dough: Weigh your flour; or measure it by gently spooning it into a cup, then sweeping off any excess.</li>
             <li>Allow the dough to rise, covered, for 1 hour.</li>
             <li>Remove the dough from the refrigerator, and divide it in half.</li>
          </ol>
        </article>
        <article title="Interesting Pizza Facts">
            <h2>Pizza Facts</h2>
           <p>Do you know the differnece?</p>
           <di>
               <dt>Dough</dt>
               <dd>Basisi for Pizza</dd>
               <dt>Tomatoes</dt>
               <dd>Are delicous veggies</dd>
           </di>
        </article>

    </main>
    <footer>
        &copy; Vanja Zivanic
    </footer>
</body>

</html>
