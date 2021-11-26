package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocWelfareinfomx;
import cn.ibizlab.ehr.webapi.dto.SocWelfareinfomxDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocWelfareinfomxMappingImpl implements SocWelfareinfomxMapping {

    @Override
    public SocWelfareinfomx toDomain(SocWelfareinfomxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocWelfareinfomx socWelfareinfomx = new SocWelfareinfomx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socWelfareinfomx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socWelfareinfomx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDwjs() != null ) {
            socWelfareinfomx.setDwjs( dto.getDwjs() );
        }
        if ( dto.getSocwelfareinfomxname() != null ) {
            socWelfareinfomx.setSocwelfareinfomxname( dto.getSocwelfareinfomxname() );
        }
        if ( dto.getGrjs() != null ) {
            socWelfareinfomx.setGrjs( dto.getGrjs() );
        }
        if ( dto.getBz() != null ) {
            socWelfareinfomx.setBz( dto.getBz() );
        }
        if ( dto.getSocselfarebasemxid() != null ) {
            socWelfareinfomx.setSocselfarebasemxid( dto.getSocselfarebasemxid() );
        }
        if ( dto.getSocwelfareinfoid() != null ) {
            socWelfareinfomx.setSocwelfareinfoid( dto.getSocwelfareinfoid() );
        }
        if ( dto.getCreateman() != null ) {
            socWelfareinfomx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSocwelfareinfomxid() != null ) {
            socWelfareinfomx.setSocwelfareinfomxid( dto.getSocwelfareinfomxid() );
        }
        if ( dto.getUpdateman() != null ) {
            socWelfareinfomx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            socWelfareinfomx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            socWelfareinfomx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSm() != null ) {
            socWelfareinfomx.setSm( dto.getSm() );
        }
        if ( dto.getSocwelfareinfoname() != null ) {
            socWelfareinfomx.setSocwelfareinfoname( dto.getSocwelfareinfoname() );
        }
        if ( dto.getDwbl() != null ) {
            socWelfareinfomx.setDwbl( dto.getDwbl() );
        }
        if ( dto.getDe() != null ) {
            socWelfareinfomx.setDe( dto.getDe() );
        }
        if ( dto.getGrbl() != null ) {
            socWelfareinfomx.setGrbl( dto.getGrbl() );
        }
        if ( dto.getSbfllx() != null ) {
            socWelfareinfomx.setSbfllx( dto.getSbfllx() );
        }

        return socWelfareinfomx;
    }

    @Override
    public SocWelfareinfomxDTO toDto(SocWelfareinfomx entity) {
        if ( entity == null ) {
            return null;
        }

        SocWelfareinfomxDTO socWelfareinfomxDTO = new SocWelfareinfomxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socWelfareinfomxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socWelfareinfomxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDwjs() != null ) {
            socWelfareinfomxDTO.setDwjs( entity.getDwjs() );
        }
        if ( entity.getSocwelfareinfomxname() != null ) {
            socWelfareinfomxDTO.setSocwelfareinfomxname( entity.getSocwelfareinfomxname() );
        }
        if ( entity.getGrjs() != null ) {
            socWelfareinfomxDTO.setGrjs( entity.getGrjs() );
        }
        if ( entity.getBz() != null ) {
            socWelfareinfomxDTO.setBz( entity.getBz() );
        }
        if ( entity.getSocselfarebasemxid() != null ) {
            socWelfareinfomxDTO.setSocselfarebasemxid( entity.getSocselfarebasemxid() );
        }
        if ( entity.getSocwelfareinfoid() != null ) {
            socWelfareinfomxDTO.setSocwelfareinfoid( entity.getSocwelfareinfoid() );
        }
        if ( entity.getCreateman() != null ) {
            socWelfareinfomxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSocwelfareinfomxid() != null ) {
            socWelfareinfomxDTO.setSocwelfareinfomxid( entity.getSocwelfareinfomxid() );
        }
        if ( entity.getUpdateman() != null ) {
            socWelfareinfomxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            socWelfareinfomxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            socWelfareinfomxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSm() != null ) {
            socWelfareinfomxDTO.setSm( entity.getSm() );
        }
        if ( entity.getSocwelfareinfoname() != null ) {
            socWelfareinfomxDTO.setSocwelfareinfoname( entity.getSocwelfareinfoname() );
        }
        if ( entity.getDwbl() != null ) {
            socWelfareinfomxDTO.setDwbl( entity.getDwbl() );
        }
        if ( entity.getDe() != null ) {
            socWelfareinfomxDTO.setDe( entity.getDe() );
        }
        if ( entity.getGrbl() != null ) {
            socWelfareinfomxDTO.setGrbl( entity.getGrbl() );
        }
        if ( entity.getSbfllx() != null ) {
            socWelfareinfomxDTO.setSbfllx( entity.getSbfllx() );
        }

        return socWelfareinfomxDTO;
    }

    @Override
    public List<SocWelfareinfomx> toDomain(List<SocWelfareinfomxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocWelfareinfomx> list = new ArrayList<SocWelfareinfomx>( dtoList.size() );
        for ( SocWelfareinfomxDTO socWelfareinfomxDTO : dtoList ) {
            list.add( toDomain( socWelfareinfomxDTO ) );
        }

        return list;
    }

    @Override
    public List<SocWelfareinfomxDTO> toDto(List<SocWelfareinfomx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocWelfareinfomxDTO> list = new ArrayList<SocWelfareinfomxDTO>( entityList.size() );
        for ( SocWelfareinfomx socWelfareinfomx : entityList ) {
            list.add( toDto( socWelfareinfomx ) );
        }

        return list;
    }
}
