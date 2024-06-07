package com.poly.polyapcsafinalproject23_24;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChooseGameFragment extends Fragment {

    public Context context;

    private RecyclerView recyclerView;
    private ArrayList<ModelGame> gameList;

    public static ChooseGameFragment newInstance(ArrayList<ModelGame> gameList) {
        ChooseGameFragment fragment = new ChooseGameFragment();
        fragment.gameList = gameList;
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.context = getActivity();
        return inflater.inflate(R.layout.fragment_games, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.mRecyclerView);
        this.recyclerView = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        gameList = new ArrayList<ModelGame>();
        gameList.add(new ModelGame("Daniel", "Bingham", "Summer Vacation in Japan", new GameBinghamDaniel()));
        gameList.add(new ModelGame("Andrew", "Leang", "Pills", new GameLeangThong()));
        gameList.add(new ModelGame("Roy", "Vidal", "Amazon Trip Planner", new GameRoyVidal()));
        gameList.add(new ModelGame("Michael", "Ontiveros", "Wake Up Game", new GameOntiverosMichael()));
        gameList.add(new ModelGame("Charles", "Cashaw", "Gymhead", new GameCashawCharles()));
        gameList.add(new ModelGame("Mr.", "Burke", "Labor Day Weekend", new GameLaborDayAdventure()));
        gameList.add(new ModelGame("Mr.", "Burke", "Hot Dog Eating Contest", new GameHotDogEatingContest()));
        gameList.add(new ModelGame("Damien", "Padillo", "Don't Scream", new GamePadilloDamien()));
        gameList.add(new ModelGame("Cristian", "Sanchez", "Try to find a way out!", new GameSanchezCristian()));
        gameList.add(new ModelGame("Bob", "Lim", "Working Game", new GameLimBob()));
        gameList.add(new ModelGame("Hugo", "Chavez", "Attack on Titan", new GameChavezHugo()));
        gameList.add(new ModelGame("Aaron.", "Sann", "Pokemon RPG", new GameSannAaron()));
        gameList.add(new ModelGame("Tayshawn", "Reed", "Portal of Entries", new GameReedTayshawn());


        RecyclerViewAdapterGame adapter = new RecyclerViewAdapterGame(this.context, this.gameList);
        this.recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new RecyclerViewAdapterGame.OnItemClickListener() {
            public void onItemClick(ModelGame model) {
                Log.d("Clicked", model.getGameName());
                startActivity(new Intent(ChooseGameFragment.this.context, model.getActivity().getClass()));
            }
        });
    }
}
