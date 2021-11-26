package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmCsrcmspj;
import cn.ibizlab.ehr.webapi.dto.PcmCsrcmspjDTO;
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
public class PcmCsrcmspjMappingImpl implements PcmCsrcmspjMapping {

    @Override
    public PcmCsrcmspj toDomain(PcmCsrcmspjDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmCsrcmspj pcmCsrcmspj = new PcmCsrcmspj();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmCsrcmspj.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmCsrcmspj.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMspj() != null ) {
            pcmCsrcmspj.setMspj( dto.getMspj() );
        }
        if ( dto.getMscj() != null ) {
            pcmCsrcmspj.setMscj( dto.getMscj() );
        }
        if ( dto.getYgmc() != null ) {
            pcmCsrcmspj.setYgmc( dto.getYgmc() );
        }
        if ( dto.getYgbh() != null ) {
            pcmCsrcmspj.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPcmcsrcmspjname() != null ) {
            pcmCsrcmspj.setPcmcsrcmspjname( dto.getPcmcsrcmspjname() );
        }
        if ( dto.getPcmcsrcmspjid() != null ) {
            pcmCsrcmspj.setPcmcsrcmspjid( dto.getPcmcsrcmspjid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmCsrcmspj.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmCsrcmspj.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmCsrcmspj.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmCsrcmspj.setCreateman( dto.getCreateman() );
        }

        return pcmCsrcmspj;
    }

    @Override
    public PcmCsrcmspjDTO toDto(PcmCsrcmspj entity) {
        if ( entity == null ) {
            return null;
        }

        PcmCsrcmspjDTO pcmCsrcmspjDTO = new PcmCsrcmspjDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmCsrcmspjDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmCsrcmspjDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMspj() != null ) {
            pcmCsrcmspjDTO.setMspj( entity.getMspj() );
        }
        if ( entity.getMscj() != null ) {
            pcmCsrcmspjDTO.setMscj( entity.getMscj() );
        }
        if ( entity.getYgmc() != null ) {
            pcmCsrcmspjDTO.setYgmc( entity.getYgmc() );
        }
        if ( entity.getYgbh() != null ) {
            pcmCsrcmspjDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPcmcsrcmspjname() != null ) {
            pcmCsrcmspjDTO.setPcmcsrcmspjname( entity.getPcmcsrcmspjname() );
        }
        if ( entity.getPcmcsrcmspjid() != null ) {
            pcmCsrcmspjDTO.setPcmcsrcmspjid( entity.getPcmcsrcmspjid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmCsrcmspjDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmCsrcmspjDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmCsrcmspjDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmCsrcmspjDTO.setCreateman( entity.getCreateman() );
        }

        return pcmCsrcmspjDTO;
    }

    @Override
    public List<PcmCsrcmspj> toDomain(List<PcmCsrcmspjDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmCsrcmspj> list = new ArrayList<PcmCsrcmspj>( dtoList.size() );
        for ( PcmCsrcmspjDTO pcmCsrcmspjDTO : dtoList ) {
            list.add( toDomain( pcmCsrcmspjDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmCsrcmspjDTO> toDto(List<PcmCsrcmspj> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmCsrcmspjDTO> list = new ArrayList<PcmCsrcmspjDTO>( entityList.size() );
        for ( PcmCsrcmspj pcmCsrcmspj : entityList ) {
            list.add( toDto( pcmCsrcmspj ) );
        }

        return list;
    }
}
