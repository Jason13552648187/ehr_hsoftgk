package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmHmatser;
import cn.ibizlab.ehr.webapi.dto.TrmHmatserDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmHmatserMappingImpl implements TrmHmatserMapping {

    @Override
    public TrmHmatser toDomain(TrmHmatserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmHmatser trmHmatser = new TrmHmatser();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmHmatser.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmHmatser.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTrmhmatsername() != null ) {
            trmHmatser.setTrmhmatsername( dto.getTrmhmatsername() );
        }
        if ( dto.getLxdh() != null ) {
            trmHmatser.setLxdh( dto.getLxdh() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmHmatser.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZjhm() != null ) {
            trmHmatser.setZjhm( dto.getZjhm() );
        }
        if ( dto.getXb() != null ) {
            trmHmatser.setXb( dto.getXb() );
        }
        if ( dto.getNj() != null ) {
            trmHmatser.setNj( dto.getNj() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmHmatser.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmHmatser.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmHmatser.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getEnable() != null ) {
            trmHmatser.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmHmatser.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getTrmhmatserid() != null ) {
            trmHmatser.setTrmhmatserid( dto.getTrmhmatserid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmHmatser.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmHmatser.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmHmatser.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmHmatser.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmHmatser.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }

        return trmHmatser;
    }

    @Override
    public TrmHmatserDTO toDto(TrmHmatser entity) {
        if ( entity == null ) {
            return null;
        }

        TrmHmatserDTO trmHmatserDTO = new TrmHmatserDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmHmatserDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmHmatserDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTrmhmatsername() != null ) {
            trmHmatserDTO.setTrmhmatsername( entity.getTrmhmatsername() );
        }
        if ( entity.getLxdh() != null ) {
            trmHmatserDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmHmatserDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZjhm() != null ) {
            trmHmatserDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getXb() != null ) {
            trmHmatserDTO.setXb( entity.getXb() );
        }
        if ( entity.getNj() != null ) {
            trmHmatserDTO.setNj( entity.getNj() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmHmatserDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmHmatserDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmHmatserDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getEnable() != null ) {
            trmHmatserDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmHmatserDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getTrmhmatserid() != null ) {
            trmHmatserDTO.setTrmhmatserid( entity.getTrmhmatserid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmHmatserDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmHmatserDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmHmatserDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmHmatserDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmHmatserDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }

        return trmHmatserDTO;
    }

    @Override
    public List<TrmHmatser> toDomain(List<TrmHmatserDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmHmatser> list = new ArrayList<TrmHmatser>( dtoList.size() );
        for ( TrmHmatserDTO trmHmatserDTO : dtoList ) {
            list.add( toDomain( trmHmatserDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmHmatserDTO> toDto(List<TrmHmatser> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmHmatserDTO> list = new ArrayList<TrmHmatserDTO>( entityList.size() );
        for ( TrmHmatser trmHmatser : entityList ) {
            list.add( toDto( trmHmatser ) );
        }

        return list;
    }
}
