import React, { useEffect, useRef } from 'react';
import Preloader from '@/components/cricket/Preloader';
import Navbar from '@/components/cricket/Navbar';
import ScrollWicket from '@/components/cricket/ScrollWicket';
import Hero from '@/components/cricket/Hero';
import ProblemSection from '@/components/cricket/ProblemSection';
import DatasetSection from '@/components/cricket/DatasetSection';
import RidgeLassoSection from '@/components/cricket/RidgeLassoSection';
import Predictor from '@/components/cricket/Predictor';
import Dashboard from '@/components/cricket/Dashboard';
import Insights from '@/components/cricket/Insights';
import Pipeline from '@/components/cricket/Pipeline';
import Footer from '@/components/cricket/Footer';
import { initTheme } from '@/lib/theme';
import { initReveals } from '@/hooks/useScrollReveal';

// Set the dark "floodlit night" theme before first paint (respects saved choice).
initTheme();

export default function Home() {
  const rootRef = useRef(null);

  useEffect(() => initReveals(rootRef.current), []);

  return (
    <div ref={rootRef} className="min-h-screen overflow-x-hidden bg-background font-body text-foreground">
      <Preloader />
      <Navbar />
      <ScrollWicket />
      <main>
        <Hero />
        <div className="crease mx-auto max-w-5xl" aria-hidden="true" />
        <ProblemSection />
        <div className="crease mx-auto max-w-5xl" aria-hidden="true" />
        <DatasetSection />
        <div className="crease mx-auto max-w-5xl" aria-hidden="true" />
        <RidgeLassoSection />
        <div className="crease mx-auto max-w-5xl" aria-hidden="true" />
        <Predictor />
        <div className="crease mx-auto max-w-5xl" aria-hidden="true" />
        <Dashboard />
        <div className="crease mx-auto max-w-5xl" aria-hidden="true" />
        <Insights />
        <div className="crease mx-auto max-w-5xl" aria-hidden="true" />
        <Pipeline />
      </main>
      <Footer />
    </div>
  );
}
