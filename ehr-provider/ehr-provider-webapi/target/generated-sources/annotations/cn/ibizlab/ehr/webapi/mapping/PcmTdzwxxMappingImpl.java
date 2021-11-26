package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmTdzwxx;
import cn.ibizlab.ehr.webapi.dto.PcmTdzwxxDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmTdzwxxMappingImpl implements PcmTdzwxxMapping {

    @Override
    public PcmTdzwxx toDomain(PcmTdzwxxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmTdzwxx pcmTdzwxx = new PcmTdzwxx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmTdzwxx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmTdzwxx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDepartment() != null ) {
            pcmTdzwxx.setDepartment( dto.getDepartment() );
        }
        if ( dto.getPhaseinfo() != null ) {
            pcmTdzwxx.setPhaseinfo( dto.getPhaseinfo() );
        }
        if ( dto.getOrganization() != null ) {
            pcmTdzwxx.setOrganization( dto.getOrganization() );
        }
        if ( dto.getStatusinfo() != null ) {
            pcmTdzwxx.setStatusinfo( dto.getStatusinfo() );
        }
        if ( dto.getJobcode() != null ) {
            pcmTdzwxx.setJobcode( dto.getJobcode() );
        }
        if ( dto.getFlag() != null ) {
            pcmTdzwxx.setFlag( dto.getFlag() );
        }
        if ( dto.getJobid() != null ) {
            pcmTdzwxx.setJobid( dto.getJobid() );
        }
        if ( dto.getInitapplydate() != null ) {
            pcmTdzwxx.setInitapplydate( dto.getInitapplydate() );
        }
        if ( dto.getTdzwxxname() != null ) {
            pcmTdzwxx.setTdzwxxname( dto.getTdzwxxname() );
        }
        if ( dto.getBbsj() != null ) {
            pcmTdzwxx.setBbsj( dto.getBbsj() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmTdzwxx.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmTdzwxx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmTdzwxx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmTdzwxx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmTdzwxx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTdzwxxid() != null ) {
            pcmTdzwxx.setTdzwxxid( dto.getTdzwxxid() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmTdzwxx.setCertificatenumber( dto.getCertificatenumber() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmTdzwxx.setPcmprofilename( dto.getPcmprofilename() );
        }

        return pcmTdzwxx;
    }

    @Override
    public PcmTdzwxxDTO toDto(PcmTdzwxx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmTdzwxxDTO pcmTdzwxxDTO = new PcmTdzwxxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmTdzwxxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmTdzwxxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDepartment() != null ) {
            pcmTdzwxxDTO.setDepartment( entity.getDepartment() );
        }
        if ( entity.getPhaseinfo() != null ) {
            pcmTdzwxxDTO.setPhaseinfo( entity.getPhaseinfo() );
        }
        if ( entity.getOrganization() != null ) {
            pcmTdzwxxDTO.setOrganization( entity.getOrganization() );
        }
        if ( entity.getStatusinfo() != null ) {
            pcmTdzwxxDTO.setStatusinfo( entity.getStatusinfo() );
        }
        if ( entity.getJobcode() != null ) {
            pcmTdzwxxDTO.setJobcode( entity.getJobcode() );
        }
        if ( entity.getFlag() != null ) {
            pcmTdzwxxDTO.setFlag( entity.getFlag() );
        }
        if ( entity.getJobid() != null ) {
            pcmTdzwxxDTO.setJobid( entity.getJobid() );
        }
        if ( entity.getInitapplydate() != null ) {
            pcmTdzwxxDTO.setInitapplydate( entity.getInitapplydate() );
        }
        if ( entity.getTdzwxxname() != null ) {
            pcmTdzwxxDTO.setTdzwxxname( entity.getTdzwxxname() );
        }
        if ( entity.getBbsj() != null ) {
            pcmTdzwxxDTO.setBbsj( entity.getBbsj() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmTdzwxxDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmTdzwxxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmTdzwxxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmTdzwxxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmTdzwxxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTdzwxxid() != null ) {
            pcmTdzwxxDTO.setTdzwxxid( entity.getTdzwxxid() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmTdzwxxDTO.setCertificatenumber( entity.getCertificatenumber() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmTdzwxxDTO.setPcmprofilename( entity.getPcmprofilename() );
        }

        return pcmTdzwxxDTO;
    }

    @Override
    public List<PcmTdzwxx> toDomain(List<PcmTdzwxxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmTdzwxx> list = new ArrayList<PcmTdzwxx>( dtoList.size() );
        for ( PcmTdzwxxDTO pcmTdzwxxDTO : dtoList ) {
            list.add( toDomain( pcmTdzwxxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmTdzwxxDTO> toDto(List<PcmTdzwxx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmTdzwxxDTO> list = new ArrayList<PcmTdzwxxDTO>( entityList.size() );
        for ( PcmTdzwxx pcmTdzwxx : entityList ) {
            list.add( toDto( pcmTdzwxx ) );
        }

        return list;
    }
}
