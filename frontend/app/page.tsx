import Link from "next/link";

const pages: string[] = [
  "accueil",
  "rendez_vous",
  "dossiers",
];

export default function Home() {
  return (
    <main>
      <h1>{"Portail clinique"}</h1>
      {pages.length === 0 ? (
        <p>Aucune page n'est déclarée dans le canvas.</p>
      ) : (
        <ul>
          {pages.map((page) => (
            <li key={page}>
              <Link href={`/${page}`}>{page}</Link>
            </li>
          ))}
        </ul>
      )}
    </main>
  );
}
