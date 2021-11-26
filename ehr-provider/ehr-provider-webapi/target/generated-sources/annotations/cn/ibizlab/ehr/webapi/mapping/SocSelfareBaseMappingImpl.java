package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocSelfareBase;
import cn.ibizlab.ehr.webapi.dto.SocSelfareBaseDTO;
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
public class SocSelfareBaseMappingImpl implements SocSelfareBaseMapping {

    @Override
    public SocSelfareBase toDomain(SocSelfareBaseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocSelfareBase socSelfareBase = new SocSelfareBase();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socSelfareBase.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socSelfareBase.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocselfarebasename() != null ) {
            socSelfareBase.setSocselfarebasename( dto.getSocselfarebasename() );
        }
        if ( dto.getCbdq() != null ) {
            socSelfareBase.setCbdq( dto.getCbdq() );
        }
        if ( dto.getXh() != null ) {
            socSelfareBase.setXh( dto.getXh() );
        }
        if ( dto.getGrsbbl() != null ) {
            socSelfareBase.setGrsbbl( dto.getGrsbbl() );
        }
        if ( dto.getSblx() != null ) {
            socSelfareBase.setSblx( dto.getSblx() );
        }
        if ( dto.getCbdw() != null ) {
            socSelfareBase.setCbdw( dto.getCbdw() );
        }
        if ( dto.getDwsbbli() != null ) {
            socSelfareBase.setDwsbbli( dto.getDwsbbli() );
        }
        if ( dto.getOrmorgid() != null ) {
            socSelfareBase.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            socSelfareBase.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSocselfarebaseid() != null ) {
            socSelfareBase.setSocselfarebaseid( dto.getSocselfarebaseid() );
        }
        if ( dto.getUpdateman() != null ) {
            socSelfareBase.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            socSelfareBase.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEnable() != null ) {
            socSelfareBase.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            socSelfareBase.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            socSelfareBase.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            socSelfareBase.setOrmorgname( dto.getOrmorgname() );
        }

        return socSelfareBase;
    }

    @Override
    public SocSelfareBaseDTO toDto(SocSelfareBase entity) {
        if ( entity == null ) {
            return null;
        }

        SocSelfareBaseDTO socSelfareBaseDTO = new SocSelfareBaseDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socSelfareBaseDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socSelfareBaseDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocselfarebasename() != null ) {
            socSelfareBaseDTO.setSocselfarebasename( entity.getSocselfarebasename() );
        }
        if ( entity.getCbdq() != null ) {
            socSelfareBaseDTO.setCbdq( entity.getCbdq() );
        }
        if ( entity.getXh() != null ) {
            socSelfareBaseDTO.setXh( entity.getXh() );
        }
        if ( entity.getGrsbbl() != null ) {
            socSelfareBaseDTO.setGrsbbl( entity.getGrsbbl() );
        }
        if ( entity.getSblx() != null ) {
            socSelfareBaseDTO.setSblx( entity.getSblx() );
        }
        if ( entity.getCbdw() != null ) {
            socSelfareBaseDTO.setCbdw( entity.getCbdw() );
        }
        if ( entity.getDwsbbli() != null ) {
            socSelfareBaseDTO.setDwsbbli( entity.getDwsbbli() );
        }
        if ( entity.getOrmorgid() != null ) {
            socSelfareBaseDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            socSelfareBaseDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSocselfarebaseid() != null ) {
            socSelfareBaseDTO.setSocselfarebaseid( entity.getSocselfarebaseid() );
        }
        if ( entity.getUpdateman() != null ) {
            socSelfareBaseDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            socSelfareBaseDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEnable() != null ) {
            socSelfareBaseDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            socSelfareBaseDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            socSelfareBaseDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            socSelfareBaseDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return socSelfareBaseDTO;
    }

    @Override
    public List<SocSelfareBase> toDomain(List<SocSelfareBaseDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocSelfareBase> list = new ArrayList<SocSelfareBase>( dtoList.size() );
        for ( SocSelfareBaseDTO socSelfareBaseDTO : dtoList ) {
            list.add( toDomain( socSelfareBaseDTO ) );
        }

        return list;
    }

    @Override
    public List<SocSelfareBaseDTO> toDto(List<SocSelfareBase> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocSelfareBaseDTO> list = new ArrayList<SocSelfareBaseDTO>( entityList.size() );
        for ( SocSelfareBase socSelfareBase : entityList ) {
            list.add( toDto( socSelfareBase ) );
        }

        return list;
    }
}
