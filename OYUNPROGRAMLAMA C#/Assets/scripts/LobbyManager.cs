using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class LobbyManager : MonoBehaviour
{
    
    void Start()
    {
        
    }

    
    void Update()
    {
        
    }
     public void OyundanGit()
    {
        SceneManager.LoadScene("GameScene");
    }

    public void OyundanCık()
    {
        Application.Quit();

    }
}
