// Image autonome (Dockerfile) ; sans optimisation d'images, donc sans dépendance native.
const nextConfig = {
  output: "standalone",
  images: { unoptimized: true },
};

export default nextConfig;
