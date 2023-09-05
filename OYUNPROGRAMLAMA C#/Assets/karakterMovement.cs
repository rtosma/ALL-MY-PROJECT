using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class karakterMovement : MonoBehaviour
{
    Rigidbody _fizik;

    float x,z;
    GameObject _camera;
    float hiz = 500f;
    private Vector3 _cameraFark;

    public Text _scoreText;
    private int _puan = 0;

    GameManager _gameManager;


    void Start()
    {
        _fizik = GetComponent<Rigidbody>();
        _gameManager = GameObject.Find("GameManager").GetComponent<GameManager>();
        _camera = GameObject.Find("Main Camera");
        _cameraFark = _camera.transform.position - gameObject.transform.position;
    }
    public void FixedUpdate()
    {
        topMovement();
        CameraScript();

    }


    // Update is called once per frame
    void Update()
    {
        if (_puan >=3)

        {
            _gameManager.OyunSahnesiniYukle();
        }
    }
    #region OzelMethod

    public void topMovement()
    {
        x= Input.GetAxis("Horizontal");
        z= Input.GetAxis("Vertical");

        Vector3 vec = new Vector3(x,0.0f,z);
        _fizik.AddForce(vec*Time.fixedDeltaTime*hiz);
    }

    public void CameraScript()
    {
        _camera.gameObject.transform.position = gameObject.transform.position + _cameraFark;
    }
    #endregion
    private void OnTriggerEnter(Collider other)
    {
        if (other.gameObject.transform.tag == "Finish")
        {
            Destroy(other.gameObject);
            _puan++;
            _scoreText.text = "Puan = "+ _puan;
        }

    }
}
