package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmRcxl;
import cn.ibizlab.ehr.webapi.dto.PcmRcxlDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmRcxlMappingImpl implements PcmRcxlMapping {

    @Override
    public PcmRcxl toDomain(PcmRcxlDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmRcxl pcmRcxl = new PcmRcxl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmRcxl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmRcxl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getCode() != null ) {
            pcmRcxl.setCode( dto.getCode() );
        }
        if ( dto.getSnumber() != null ) {
            pcmRcxl.setSnumber( dto.getSnumber() );
        }
        if ( dto.getRcxllx() != null ) {
            pcmRcxl.setRcxllx( dto.getRcxllx() );
        }
        if ( dto.getPcmrcxlname() != null ) {
            pcmRcxl.setPcmrcxlname( dto.getPcmrcxlname() );
        }
        if ( dto.getXldj() != null ) {
            pcmRcxl.setXldj( dto.getXldj() );
        }
        if ( dto.getPcmrcxlid2() != null ) {
            pcmRcxl.setPcmrcxlid2( dto.getPcmrcxlid2() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmRcxl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmRcxl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmRcxl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getRcxlmc() != null ) {
            pcmRcxl.setRcxlmc( dto.getRcxlmc() );
        }
        if ( dto.getPcmrcxlid() != null ) {
            pcmRcxl.setPcmrcxlid( dto.getPcmrcxlid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmRcxl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmrcxlname2() != null ) {
            pcmRcxl.setPcmrcxlname2( dto.getPcmrcxlname2() );
        }

        return pcmRcxl;
    }

    @Override
    public PcmRcxlDTO toDto(PcmRcxl entity) {
        if ( entity == null ) {
            return null;
        }

        PcmRcxlDTO pcmRcxlDTO = new PcmRcxlDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmRcxlDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmRcxlDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getCode() != null ) {
            pcmRcxlDTO.setCode( entity.getCode() );
        }
        if ( entity.getSnumber() != null ) {
            pcmRcxlDTO.setSnumber( entity.getSnumber() );
        }
        if ( entity.getRcxllx() != null ) {
            pcmRcxlDTO.setRcxllx( entity.getRcxllx() );
        }
        if ( entity.getPcmrcxlname() != null ) {
            pcmRcxlDTO.setPcmrcxlname( entity.getPcmrcxlname() );
        }
        if ( entity.getXldj() != null ) {
            pcmRcxlDTO.setXldj( entity.getXldj() );
        }
        if ( entity.getPcmrcxlid2() != null ) {
            pcmRcxlDTO.setPcmrcxlid2( entity.getPcmrcxlid2() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmRcxlDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmRcxlDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmRcxlDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getRcxlmc() != null ) {
            pcmRcxlDTO.setRcxlmc( entity.getRcxlmc() );
        }
        if ( entity.getPcmrcxlid() != null ) {
            pcmRcxlDTO.setPcmrcxlid( entity.getPcmrcxlid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmRcxlDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmrcxlname2() != null ) {
            pcmRcxlDTO.setPcmrcxlname2( entity.getPcmrcxlname2() );
        }

        return pcmRcxlDTO;
    }

    @Override
    public List<PcmRcxl> toDomain(List<PcmRcxlDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmRcxl> list = new ArrayList<PcmRcxl>( dtoList.size() );
        for ( PcmRcxlDTO pcmRcxlDTO : dtoList ) {
            list.add( toDomain( pcmRcxlDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmRcxlDTO> toDto(List<PcmRcxl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmRcxlDTO> list = new ArrayList<PcmRcxlDTO>( entityList.size() );
        for ( PcmRcxl pcmRcxl : entityList ) {
            list.add( toDto( pcmRcxl ) );
        }

        return list;
    }
}
