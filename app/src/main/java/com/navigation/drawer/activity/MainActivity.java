package com.navigation.drawer.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.navigation.drawer.fragment.FifthFragment;
import com.navigation.drawer.fragment.FourthFragment;
import com.navigation.drawer.fragment.HomeFragment;
import com.navigation.drawer.fragment.OneFragment;
import com.navigation.drawer.R;
import com.navigation.drawer.fragment.SixthFragment;
import com.navigation.drawer.fragment.ThirdFragment;
import com.navigation.drawer.fragment.TwoFragment;

import me.henrytao.smoothappbarlayout.SmoothAppBarLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private SmoothAppBarLayout smoothAppBarLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        smoothAppBarLayout = (SmoothAppBarLayout) findViewById(R.id.smooth_bar_layout);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar_layout);


        HomeFragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, homeFragment).commit();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer) {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        smoothAppBarLayout.setExpanded(true);
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, homeFragment).commit();
                        break;
                    case R.id.one:
                        smoothAppBarLayout.setExpanded(false);
                        OneFragment oneFragment = new OneFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, oneFragment).commit();
                        break;
                    case R.id.two:
                        smoothAppBarLayout.setExpanded(false);
                        TwoFragment twoFragment = new TwoFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, twoFragment).commit();
                        break;
                    case R.id.three:
                        smoothAppBarLayout.setExpanded(false);
                        ThirdFragment threeFragment = new ThirdFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, threeFragment).commit();
                        break;
                    case R.id.four:
                        smoothAppBarLayout.setExpanded(false);
                        FourthFragment fourthFragment = new FourthFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, fourthFragment).commit();
                        break;
                    case R.id.five:
                        smoothAppBarLayout.setExpanded(false);
                        FifthFragment fifthFragment = new FifthFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, fifthFragment).commit();
                        break;
                    case R.id.six:
                        smoothAppBarLayout.setExpanded(false);
                        SixthFragment sixthFragment = new SixthFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, sixthFragment).commit();
                        break;
                }
                collapsingToolbarLayout.setTitle(item.getTitle());
                collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
                collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.white));
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }
}
