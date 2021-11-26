package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainPerson;
import cn.ibizlab.ehr.webapi.dto.TrmTrainPersonDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainPersonMappingImpl implements TrmTrainPersonMapping {

    @Override
    public TrmTrainPerson toDomain(TrmTrainPersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainPerson trmTrainPerson = new TrmTrainPerson();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainPerson.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainPerson.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTrmtrianpersonname() != null ) {
            trmTrainPerson.setTrmtrianpersonname( dto.getTrmtrianpersonname() );
        }
        if ( dto.getSfzs() != null ) {
            trmTrainPerson.setSfzs( dto.getSfzs() );
        }
        if ( dto.getGw() != null ) {
            trmTrainPerson.setGw( dto.getGw() );
        }
        if ( dto.getPxbj() != null ) {
            trmTrainPerson.setPxbj( dto.getPxbj() );
        }
        if ( dto.getPxjg() != null ) {
            trmTrainPerson.setPxjg( dto.getPxjg() );
        }
        if ( dto.getPxkc() != null ) {
            trmTrainPerson.setPxkc( dto.getPxkc() );
        }
        if ( dto.getJsfs() != null ) {
            trmTrainPerson.setJsfs( dto.getJsfs() );
        }
        if ( dto.getFs() != null ) {
            trmTrainPerson.setFs( dto.getFs() );
        }
        if ( dto.getTrainbegin() != null ) {
            trmTrainPerson.setTrainbegin( dto.getTrainbegin() );
        }
        if ( dto.getTrainend() != null ) {
            trmTrainPerson.setTrainend( dto.getTrainend() );
        }
        if ( dto.getFjh() != null ) {
            trmTrainPerson.setFjh( dto.getFjh() );
        }
        if ( dto.getTrainres() != null ) {
            trmTrainPerson.setTrainres( dto.getTrainres() );
        }
        if ( dto.getPxjssj() != null ) {
            trmTrainPerson.setPxjssj( dto.getPxjssj() );
        }
        if ( dto.getZw() != null ) {
            trmTrainPerson.setZw( dto.getZw() );
        }
        if ( dto.getBm() != null ) {
            trmTrainPerson.setBm( dto.getBm() );
        }
        if ( dto.getLxdh() != null ) {
            trmTrainPerson.setLxdh( dto.getLxdh() );
        }
        if ( dto.getZz() != null ) {
            trmTrainPerson.setZz( dto.getZz() );
        }
        if ( dto.getXb() != null ) {
            trmTrainPerson.setXb( dto.getXb() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmTrainPerson.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmTrainPerson.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmTrainPerson.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }
        if ( dto.getYgbh() != null ) {
            trmTrainPerson.setYgbh( dto.getYgbh() );
        }
        if ( dto.getTrmtrainplantermname() != null ) {
            trmTrainPerson.setTrmtrainplantermname( dto.getTrmtrainplantermname() );
        }
        if ( dto.getPxkssj() != null ) {
            trmTrainPerson.setPxkssj( dto.getPxkssj() );
        }
        if ( dto.getNj() != null ) {
            trmTrainPerson.setNj( dto.getNj() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmTrainPerson.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getTrmtrainplantermid() != null ) {
            trmTrainPerson.setTrmtrainplantermid( dto.getTrmtrainplantermid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainPerson.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainPerson.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainPerson.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTrmtrianpersonid() != null ) {
            trmTrainPerson.setTrmtrianpersonid( dto.getTrmtrianpersonid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainPerson.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainPerson.setEnable( dto.getEnable() );
        }
        if ( dto.getJhxbm() != null ) {
            trmTrainPerson.setJhxbm( dto.getJhxbm() );
        }
        if ( dto.getTrmtrainteachername() != null ) {
            trmTrainPerson.setTrmtrainteachername( dto.getTrmtrainteachername() );
        }
        if ( dto.getBzr() != null ) {
            trmTrainPerson.setBzr( dto.getBzr() );
        }

        return trmTrainPerson;
    }

    @Override
    public TrmTrainPersonDTO toDto(TrmTrainPerson entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainPersonDTO trmTrainPersonDTO = new TrmTrainPersonDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainPersonDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainPersonDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTrmtrianpersonname() != null ) {
            trmTrainPersonDTO.setTrmtrianpersonname( entity.getTrmtrianpersonname() );
        }
        if ( entity.getSfzs() != null ) {
            trmTrainPersonDTO.setSfzs( entity.getSfzs() );
        }
        if ( entity.getGw() != null ) {
            trmTrainPersonDTO.setGw( entity.getGw() );
        }
        if ( entity.getPxbj() != null ) {
            trmTrainPersonDTO.setPxbj( entity.getPxbj() );
        }
        if ( entity.getPxjg() != null ) {
            trmTrainPersonDTO.setPxjg( entity.getPxjg() );
        }
        if ( entity.getPxkc() != null ) {
            trmTrainPersonDTO.setPxkc( entity.getPxkc() );
        }
        if ( entity.getJsfs() != null ) {
            trmTrainPersonDTO.setJsfs( entity.getJsfs() );
        }
        if ( entity.getFs() != null ) {
            trmTrainPersonDTO.setFs( entity.getFs() );
        }
        if ( entity.getTrainbegin() != null ) {
            trmTrainPersonDTO.setTrainbegin( entity.getTrainbegin() );
        }
        if ( entity.getTrainend() != null ) {
            trmTrainPersonDTO.setTrainend( entity.getTrainend() );
        }
        if ( entity.getFjh() != null ) {
            trmTrainPersonDTO.setFjh( entity.getFjh() );
        }
        if ( entity.getTrainres() != null ) {
            trmTrainPersonDTO.setTrainres( entity.getTrainres() );
        }
        if ( entity.getPxjssj() != null ) {
            trmTrainPersonDTO.setPxjssj( entity.getPxjssj() );
        }
        if ( entity.getZw() != null ) {
            trmTrainPersonDTO.setZw( entity.getZw() );
        }
        if ( entity.getBm() != null ) {
            trmTrainPersonDTO.setBm( entity.getBm() );
        }
        if ( entity.getLxdh() != null ) {
            trmTrainPersonDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getZz() != null ) {
            trmTrainPersonDTO.setZz( entity.getZz() );
        }
        if ( entity.getXb() != null ) {
            trmTrainPersonDTO.setXb( entity.getXb() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmTrainPersonDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmTrainPersonDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmTrainPersonDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }
        if ( entity.getYgbh() != null ) {
            trmTrainPersonDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getTrmtrainplantermname() != null ) {
            trmTrainPersonDTO.setTrmtrainplantermname( entity.getTrmtrainplantermname() );
        }
        if ( entity.getPxkssj() != null ) {
            trmTrainPersonDTO.setPxkssj( entity.getPxkssj() );
        }
        if ( entity.getNj() != null ) {
            trmTrainPersonDTO.setNj( entity.getNj() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmTrainPersonDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getTrmtrainplantermid() != null ) {
            trmTrainPersonDTO.setTrmtrainplantermid( entity.getTrmtrainplantermid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainPersonDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainPersonDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainPersonDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTrmtrianpersonid() != null ) {
            trmTrainPersonDTO.setTrmtrianpersonid( entity.getTrmtrianpersonid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainPersonDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainPersonDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getJhxbm() != null ) {
            trmTrainPersonDTO.setJhxbm( entity.getJhxbm() );
        }
        if ( entity.getTrmtrainteachername() != null ) {
            trmTrainPersonDTO.setTrmtrainteachername( entity.getTrmtrainteachername() );
        }
        if ( entity.getBzr() != null ) {
            trmTrainPersonDTO.setBzr( entity.getBzr() );
        }

        return trmTrainPersonDTO;
    }

    @Override
    public List<TrmTrainPerson> toDomain(List<TrmTrainPersonDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainPerson> list = new ArrayList<TrmTrainPerson>( dtoList.size() );
        for ( TrmTrainPersonDTO trmTrainPersonDTO : dtoList ) {
            list.add( toDomain( trmTrainPersonDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainPersonDTO> toDto(List<TrmTrainPerson> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainPersonDTO> list = new ArrayList<TrmTrainPersonDTO>( entityList.size() );
        for ( TrmTrainPerson trmTrainPerson : entityList ) {
            list.add( toDto( trmTrainPerson ) );
        }

        return list;
    }
}
