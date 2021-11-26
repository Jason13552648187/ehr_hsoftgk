package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocSelfarebasemx;
import cn.ibizlab.ehr.webapi.dto.SocSelfarebasemxDTO;
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
public class SocSelfarebasemxMappingImpl implements SocSelfarebasemxMapping {

    @Override
    public SocSelfarebasemx toDomain(SocSelfarebasemxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocSelfarebasemx socSelfarebasemx = new SocSelfarebasemx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socSelfarebasemx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socSelfarebasemx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBz() != null ) {
            socSelfarebasemx.setBz( dto.getBz() );
        }
        if ( dto.getGrbl() != null ) {
            socSelfarebasemx.setGrbl( dto.getGrbl() );
        }
        if ( dto.getSm() != null ) {
            socSelfarebasemx.setSm( dto.getSm() );
        }
        if ( dto.getDwbl() != null ) {
            socSelfarebasemx.setDwbl( dto.getDwbl() );
        }
        if ( dto.getSocselfarebasemxname() != null ) {
            socSelfarebasemx.setSocselfarebasemxname( dto.getSocselfarebasemxname() );
        }
        if ( dto.getSbfllx() != null ) {
            socSelfarebasemx.setSbfllx( dto.getSbfllx() );
        }
        if ( dto.getDe() != null ) {
            socSelfarebasemx.setDe( dto.getDe() );
        }
        if ( dto.getSocselfarebaseid() != null ) {
            socSelfarebasemx.setSocselfarebaseid( dto.getSocselfarebaseid() );
        }
        if ( dto.getSoccompanywelid() != null ) {
            socSelfarebasemx.setSoccompanywelid( dto.getSoccompanywelid() );
        }
        if ( dto.getUpdatedate() != null ) {
            socSelfarebasemx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            socSelfarebasemx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSocselfarebasemxid() != null ) {
            socSelfarebasemx.setSocselfarebasemxid( dto.getSocselfarebasemxid() );
        }
        if ( dto.getUpdateman() != null ) {
            socSelfarebasemx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            socSelfarebasemx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSoccompanywelname() != null ) {
            socSelfarebasemx.setSoccompanywelname( dto.getSoccompanywelname() );
        }

        return socSelfarebasemx;
    }

    @Override
    public SocSelfarebasemxDTO toDto(SocSelfarebasemx entity) {
        if ( entity == null ) {
            return null;
        }

        SocSelfarebasemxDTO socSelfarebasemxDTO = new SocSelfarebasemxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socSelfarebasemxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socSelfarebasemxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBz() != null ) {
            socSelfarebasemxDTO.setBz( entity.getBz() );
        }
        if ( entity.getGrbl() != null ) {
            socSelfarebasemxDTO.setGrbl( entity.getGrbl() );
        }
        if ( entity.getSm() != null ) {
            socSelfarebasemxDTO.setSm( entity.getSm() );
        }
        if ( entity.getDwbl() != null ) {
            socSelfarebasemxDTO.setDwbl( entity.getDwbl() );
        }
        if ( entity.getSocselfarebasemxname() != null ) {
            socSelfarebasemxDTO.setSocselfarebasemxname( entity.getSocselfarebasemxname() );
        }
        if ( entity.getSbfllx() != null ) {
            socSelfarebasemxDTO.setSbfllx( entity.getSbfllx() );
        }
        if ( entity.getDe() != null ) {
            socSelfarebasemxDTO.setDe( entity.getDe() );
        }
        if ( entity.getSocselfarebaseid() != null ) {
            socSelfarebasemxDTO.setSocselfarebaseid( entity.getSocselfarebaseid() );
        }
        if ( entity.getSoccompanywelid() != null ) {
            socSelfarebasemxDTO.setSoccompanywelid( entity.getSoccompanywelid() );
        }
        if ( entity.getUpdatedate() != null ) {
            socSelfarebasemxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            socSelfarebasemxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSocselfarebasemxid() != null ) {
            socSelfarebasemxDTO.setSocselfarebasemxid( entity.getSocselfarebasemxid() );
        }
        if ( entity.getUpdateman() != null ) {
            socSelfarebasemxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            socSelfarebasemxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSoccompanywelname() != null ) {
            socSelfarebasemxDTO.setSoccompanywelname( entity.getSoccompanywelname() );
        }

        return socSelfarebasemxDTO;
    }

    @Override
    public List<SocSelfarebasemx> toDomain(List<SocSelfarebasemxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocSelfarebasemx> list = new ArrayList<SocSelfarebasemx>( dtoList.size() );
        for ( SocSelfarebasemxDTO socSelfarebasemxDTO : dtoList ) {
            list.add( toDomain( socSelfarebasemxDTO ) );
        }

        return list;
    }

    @Override
    public List<SocSelfarebasemxDTO> toDto(List<SocSelfarebasemx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocSelfarebasemxDTO> list = new ArrayList<SocSelfarebasemxDTO>( entityList.size() );
        for ( SocSelfarebasemx socSelfarebasemx : entityList ) {
            list.add( toDto( socSelfarebasemx ) );
        }

        return list;
    }
}
